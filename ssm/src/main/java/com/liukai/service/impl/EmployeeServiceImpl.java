package com.liukai.service.impl;

import com.liukai.mapper.EmployeeMapper;
import com.liukai.pojo.Employee;
import com.liukai.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> findAll() {
        List<Employee> employees = employeeMapper.queryAll();
        return employees;
    }

    @Override
    public Employee getEmpById(Integer empId) {
        return employeeMapper.getEmpById(empId);
    }
}
