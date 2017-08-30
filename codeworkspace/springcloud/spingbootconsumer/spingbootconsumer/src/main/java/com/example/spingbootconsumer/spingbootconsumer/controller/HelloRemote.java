package com.example.spingbootconsumer.spingbootconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wei on 2017/8/24 0024.
 */
@FeignClient("spring-cloud-producer")
public interface HelloRemote {


    @RequestMapping(value="/hello")
    public String hello(@RequestParam(name="name", value="") String name);
}
