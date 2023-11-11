package com.liukai;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liukai.mapper.UserMapper;
import com.liukai.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;

@SpringBootTest
public class SampleTestMapper {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

    @Test
    public void testInsert(){
        System.out.println(("----- insert method test ------"));
        User user = new User(null,"lk",28,"110@qq.com",0,null);
        userMapper.insert(user);
    }

    @Test
    public void testDelete(){
        System.out.println("----- delete method test ------");

        // 根据 id 进行删除

        int rows = userMapper.deleteById(1712296524032323585L);
        System.out.println("----- deleteById method test ------" + rows);

        // 根据 age = 20 进行删除
        HashMap map = new HashMap<>();
        map.put("age",20);

        int rows2 = userMapper.deleteByMap(map);
        System.out.println("----- deleteByMap method test ------" + rows2 );

    }

    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(1L);
        user.setName("lk");
        // 根据主键id进行更新
        int rows1 = userMapper.updateById(user);
        System.out.println("----- updateById method test ------" + rows1 );
        // 不指定类型进行全表修改
        User user1 = new User();
        user1.setAge(22);
        int rows2 = userMapper.update(user1,null);
        System.out.println("----- update method test ------" + rows2 );

    }

    @Test
    public void testPageQuery(){
        //设置分页参数
        Page<User> page = new Page<>(1, 2);
        userMapper.selectPage(page, null);
        //获取分页数据
        List<User> list = page.getRecords();
        list.forEach(System.out::println);
        System.out.println("当前页："+page.getCurrent());
        System.out.println("每页显示的条数："+page.getSize());
        System.out.println("总记录数："+page.getTotal());
        System.out.println("总页数："+page.getPages());
        System.out.println("是否有上一页："+page.hasPrevious());
        System.out.println("是否有下一页："+page.hasNext());
    }

    @Test
    public void testQuick(){

        IPage page = new Page(1,2);

        userMapper.selectPageVo(page,2);

        long current = page.getCurrent();
        System.out.println("current = " + current);
        long pages = page.getPages();
        System.out.println("pages = " + pages);
        long total = page.getTotal();
        System.out.println("total = " + total);
        List records = page.getRecords();
        System.out.println("records = " + records);

    }

    @Test
    public void test02(){
        //按年龄降序查询用户，如果年龄相同则按id升序排列
        //SELECT id,username AS name,age,email,is_deleted FROM t_user WHERE is_deleted=0 ORDER BY age DESC,id ASC
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper
                .orderByDesc("age")
                .orderByAsc("id");
        List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }


    @Test
    public void test04() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        //将年龄大于20并且用户名中包含有a或邮箱为null的用户信息修改
        //UPDATE t_user SET age=?, email=? WHERE username LIKE ? AND age > ? OR email IS NULL)
        queryWrapper
                .like("name", "a")
                .gt("age", 20)
                .or()
                .isNull("email");
        User user = new User();
        user.setAge(18);
        user.setEmail("user@atguigu.com");
        int result = userMapper.update(user, queryWrapper);
        System.out.println("受影响的行数：" + result);
    }

    //逻辑删除
    @Test
    public void testQuick5(){
        //逻辑删除
        userMapper.deleteById(5);
    }

    //演示乐观锁生效场景
    @Test
    public void testQuick7(){
        //步骤1: 先查询,在更新 获取version数据
        //同时查询两条,但是version唯一,最后更新的失败
        User user  = userMapper.selectById(5);
        User user1  = userMapper.selectById(5);

        user.setAge(20);
        user1.setAge(30);

        userMapper.updateById(user);
        //乐观锁生效,失败!
        userMapper.updateById(user1);
    }

}
