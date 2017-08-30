package com.example;

import com.example.domain.Account;
import com.example.domain.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.text.DateFormat;
import java.util.Date;

import static java.util.UUID.randomUUID;

/**
 * Created by wei on 2017/5/2 0002.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = MockServletContext.class)
@WebAppConfiguration
public class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        String uuid= randomUUID().toString().replaceAll("\\-", "");
        userRepository.save(new Account("aa1"+uuid, "aa@126.com"+uuid, "aa"+uuid, "aa123456"+uuid,formattedDate));
        userRepository.save(new Account("bb2"+uuid, "bb@126.com"+uuid, "bb"+uuid, "bb123456"+uuid,formattedDate));
        userRepository.save(new Account("cc3"+uuid, "cc@126.com"+uuid, "cc"+uuid, "cc123456"+uuid,formattedDate));

//        Assert.assertEquals(9, userRepository.findAll().size());
//        Assert.assertEquals("bb", userRepository.findByUserNameOrEmail("bb", "bb@126.com").getNikeName());
//        userRepository.delete(userRepository.findByUserName("aa1"));
    }
}