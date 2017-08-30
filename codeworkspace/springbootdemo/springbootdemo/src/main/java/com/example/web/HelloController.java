package com.example.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wei on 2017/5/2 0002.
 */
@Controller //修饰class，用来创建处理http请求的对象
@EnableAutoConfiguration//这个注解告诉Spring Boot根据添加的jar依赖猜测你想如何配置Spring。
// 由于spring-boot-starter-web添加了Tomcat和Spring MVC，所以auto-configuration将假定你正在开发一个web应用并相应地对Spring进行设置。
public class HelloController {

    @RequestMapping("/")
    public String index(ModelMap map) {
        //加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        //return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }

    @RequestMapping("/page")
    public String page() {
        return "Hello World";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloController.class, args);
    }
}
