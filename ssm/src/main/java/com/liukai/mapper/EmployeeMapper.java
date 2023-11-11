package com.liukai.mapper;


import com.liukai.pojo.Employee;

import java.util.List;


public interface EmployeeMapper {
    List<Employee> queryAll();

    Employee getEmpById(Integer empId);
}
