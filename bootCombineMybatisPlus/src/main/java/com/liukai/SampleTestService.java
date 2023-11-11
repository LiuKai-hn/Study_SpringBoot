package com.liukai;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liukai.pojo.User;
import com.liukai.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SampleTestService {

    @Autowired
    private UserService userService;


    @Test
    public void saveUser(){

        User user = new User(null,"lkk",28,"110@qq.com", 0,null);
        userService.save(user);
        System.out.println("--------- save user --------");

    }


}
