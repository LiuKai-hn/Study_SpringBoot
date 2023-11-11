package com.liukai.mapper;

import com.liukai.pojo.Schedule;

import java.util.List;

public interface ScheduleMapper {
    List<Schedule> queryPage();

    void insert(Schedule schedule);
}
