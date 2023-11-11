package com.liukai.controller;

import com.liukai.pojo.User;
import com.liukai.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    @ResponseBody
    public List<User> getUser(){
        List<User> userList = userService.findList();
        log.info("查询的user数据为:{}",userList);
        return userList;
    }

    @GetMapping("/del")
    @Transactional
    public void DelUser(){
        userService.deleteUserById("1");
    }

}
