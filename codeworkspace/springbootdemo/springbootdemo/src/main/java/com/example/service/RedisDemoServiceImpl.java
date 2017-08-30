package com.example.service;

import com.example.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.cache.annotation.Cacheable;

/**
 * Created by wei on 2017/5/3 0003.
 */
@Service
public class RedisDemoServiceImpl implements RedisDemoService {

    /**
     * @param id
     * @param name
     * @param age
     * @return
     */
    @Cacheable(value = "usercache", keyGenerator  = "wiselyKeyGenerator")
    public User findUser(Long id, String name, Integer age) {
        System.out.println("无缓存的时候调用这里");
        return new User(id, name, age);
    }
}
