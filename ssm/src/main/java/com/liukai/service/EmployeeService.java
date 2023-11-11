package com.liukai.service;

import com.liukai.pojo.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    List<Employee> findAll();

    Employee getEmpById(Integer empId);

}
