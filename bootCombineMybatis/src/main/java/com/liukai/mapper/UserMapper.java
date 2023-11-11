package com.liukai.mapper;

import com.liukai.pojo.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import java.util.List;


public interface UserMapper {
    List<User> queryAll();

    void deleteUser(String id);
}
