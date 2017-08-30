package com.example.spingbootconsumer.spingbootconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by wei on 2017/8/24 0024.
 */
@RestController
public class ConsumerController {

    @Autowired
    private HelloRemote helloRemote;

    @RequestMapping(value = "/hello/{name}",method = RequestMethod.GET)
    public String index(@PathVariable String name){
        return helloRemote.hello(name);
    }


}
