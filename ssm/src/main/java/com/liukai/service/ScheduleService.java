package com.liukai.service;

import com.liukai.pojo.Schedule;
import com.liukai.utils.PageBean;

public interface ScheduleService {
    PageBean<Schedule> findByPage(int pageSize,int currentPage);
    void saveSchedule(Schedule schedule);
}
