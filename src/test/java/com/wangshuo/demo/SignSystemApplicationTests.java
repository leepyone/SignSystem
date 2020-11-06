package com.wangshuo.demo;

import com.wangshuo.demo.Entity.User;
import com.wangshuo.demo.Service.SignService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SignSystemApplicationTests {

    @Autowired
    SignService signService;
    @Test
    void contextLoads() {

//        System.out.println(signService.getAllClass(1));
        List<User> list = signService.getAllStudentsByCI(1);
        for(User user:list) {
            System.out.println(user.toString());
        }
    }

}
