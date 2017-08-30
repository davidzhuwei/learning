package com.example.spingbootprovider.spingbootprovider.comtroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wei on 2017/8/24 0024.
 */
@RestController
public class HelloController {

    @RequestMapping(value="/hello",method= RequestMethod.POST)
    public String index(@RequestParam String name){
        System.out.print("start hello ............");
        return "hello" +name +"this is first message";
    }
}
