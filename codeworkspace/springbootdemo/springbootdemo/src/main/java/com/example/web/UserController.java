package com.example.web;

import com.example.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.*;

/**
 * Created by wei on 2017/5/2 0002.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/users")
public class UserController {
    //

    static Map<Long,User> users= Collections.synchronizedMap(new HashMap<Long,User>());

    /**
     * 处理"/users/"的GET请求，用来获取用户列表
     * 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
     * @return
     */
    @RequestMapping(value = "/",method= RequestMethod.GET)
    public List<User> getUserList(){
        List<User> userList=new ArrayList<User>(users.values());
        return userList;
    }

    /**
     *  处理"/users/"的POST请求，用来创建User
     // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
     * @param user
     * @return
     */
    @RequestMapping(value="/add",method = RequestMethod.POST)
    public String postUser(){
        User user=new User(new Long(1),"david",28);
        users.put(new Long(123456),user);
        return "success";
    }

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public User getUser(@PathVariable Long id){
        // 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        return users.get(id);
    }

    /**
     * 处理"/users/{id}"的PUT请求，用来更新User信息
     * @param id
     * @param user
     * @return
     */
    @RequestMapping(value="/{id}",method = RequestMethod.PUT)
    public String putUser(@PathVariable Long id,@ModelAttribute User user){
        User u=users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id,u);
        return "success";
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id){
        users.remove(id);
        return "success";
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(UserController.class, args);
    }
}
