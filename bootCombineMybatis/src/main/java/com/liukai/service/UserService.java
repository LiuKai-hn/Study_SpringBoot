package com.liukai.service;

import com.liukai.mapper.UserMapper;
import com.liukai.pojo.User;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findList(){
        List<User> users = userMapper.queryAll();
        log.info("查询全部数据:{}",users);
        return users;
    }

    @Transactional
    public void deleteUserById(String id){
        userMapper.deleteUser(id);
        // 用于测试 遇到错误是否回滚
        System.out.println(1/0);
    }
}
