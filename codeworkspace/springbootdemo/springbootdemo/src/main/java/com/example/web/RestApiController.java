package com.example.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wei on 2017/5/2 0002.
 */
@RestController //Spring4之后加入的注解，原来在@Controller中返回json需要@ResponseBody来配合，如果直接用@RestController替代@Controller就不需要再配置@ResponseBody，默认返回json格式。
@EnableAutoConfiguration
public class RestApiController {

    @RequestMapping("/hello")//配置url映射
    public String hello(){
        return "Hello Spring Boot";
    }

    public static void main(String[] args) {
        SpringApplication.run(RestApiController.class, args);
    }
}
