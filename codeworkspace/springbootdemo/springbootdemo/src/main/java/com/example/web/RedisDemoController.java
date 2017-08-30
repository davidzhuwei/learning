package com.example.web;

import com.example.domain.User;
import com.example.service.RedisDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * Created by wei on 2017/5/3 0003.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("")
public class RedisDemoController {

    @Autowired
    protected RedisDemoService redisDemoService;

    @RequestMapping(value = "/findUser")
    public String findUser() {
        User user = redisDemoService.findUser(new Long(1), "david", 28);
        System.out.println("我这里没执行查询");
        System.out.println("resutl :" + user.getName());
        return "success";
    }

    @RequestMapping(value = "/addUser")
    public String addUser() {
        redisDemoService.findUser(new Long(1), "david", 28);
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return "success";
    }


    /**
     * session共享
     *
     * @param session
     * @return
     */
    @RequestMapping(value = "/uid")
    public String uid(HttpServletRequest request) {
        HttpSession session=request.getSession();
        UUID uid = (UUID)session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId()+"|"+session.getAttribute("uid");
    }
}
