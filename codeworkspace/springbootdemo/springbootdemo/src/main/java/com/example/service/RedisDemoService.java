package com.example.service;
import com.example.domain.User;
/**
 * Created by wei on 2017/5/3 0003.
 */
public interface RedisDemoService {

    public User findUser(Long id,String name,Integer age);

}
