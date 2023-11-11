package com.liukai.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liukai.mapper.ScheduleMapper;
import com.liukai.pojo.Schedule;
import com.liukai.service.ScheduleService;
import com.liukai.utils.PageBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ScheduleServiceImpl  implements ScheduleService {

    @Autowired
    private ScheduleMapper scheduleMapper;

    /**
     * 分页数据查询,返回分页pageBean
     *
     * @param pageSize
     * @param currentPage
     * @return
     */
    @Override
    public PageBean<Schedule> findByPage(int pageSize, int currentPage) {
        //1.设置分页参数
        PageHelper.startPage(currentPage,pageSize);
        //2.数据库查询
        List<Schedule> list = scheduleMapper.queryPage();
        //3.结果获取
        PageInfo<Schedule> pageInfo = new PageInfo<>(list);
        //4.pageBean封装
        PageBean<Schedule> pageBean = new PageBean<>(pageInfo.getPageNum(),pageInfo.getPageSize(),pageInfo.getTotal(),pageInfo.getList());

        log.info("分页查询结果:{}",pageBean);

        return pageBean;
    }

    /**
     * 保存学习计划
     *
     * @param schedule
     */
    @Override
    public void saveSchedule(Schedule schedule) {
        scheduleMapper.insert(schedule);
    }

}