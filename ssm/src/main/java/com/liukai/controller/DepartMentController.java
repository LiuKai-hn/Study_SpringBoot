package com.liukai.controller;


import com.liukai.pojo.DepartMent;
import com.liukai.pojo.Employee;
import com.liukai.service.DepartMentService;
import com.liukai.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequestMapping("dept")
@RestController
public class DepartMentController {


    @Autowired
    private DepartMentService departMentService;

    @GetMapping("/getAll")
    public List<DepartMent> getAllDept(){
        return departMentService.getAllList();
    }

    @GetMapping("/getById/{dept_id}") // 测试 1565322350815932424
    public DepartMent getByDeptId(@PathVariable(name = "dept_id") String dept_id){

        return departMentService.getByDeptId(dept_id);

    }


    @GetMapping("/diguiById/{dept_id}") // 测试 1565322350815932424
    public DepartMent diguiDepartment(@PathVariable(name = "dept_id") String dept_id){

        return departMentService.getAllDepartmentsByParentId(dept_id);

    }
}
