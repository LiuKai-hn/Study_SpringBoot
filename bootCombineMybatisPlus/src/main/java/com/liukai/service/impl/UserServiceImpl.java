package com.liukai.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liukai.mapper.UserMapper;
import com.liukai.pojo.User;
import com.liukai.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
