package com.liukai.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.liukai.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends BaseMapper<User> {

    // 自定义一个根据age 参数查询，并分页,age>?
    IPage<User> selectPageVo(IPage<?> page, @Param("age")Integer age);
}
