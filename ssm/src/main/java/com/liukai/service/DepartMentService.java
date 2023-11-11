package com.liukai.service;

import com.liukai.pojo.DepartMent;

import java.util.List;

public interface DepartMentService {

    List<DepartMent> getAllList();

    DepartMent getByDeptId(String dept_id);

    DepartMent getAllDepartmentsByParentId(String dept_id);
}
