package com.liukai.mapper;

import com.liukai.pojo.DepartMent;

import java.util.List;

public interface DepartMentMapper {

    List<DepartMent> queryAll();

    DepartMent getByDeptId(String dept_id);

    DepartMent getAllDepartmentsByParentId(String dept_id);
}
