package com.liukai.service.impl;

import com.liukai.mapper.DepartMentMapper;
import com.liukai.pojo.DepartMent;
import com.liukai.service.DepartMentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class DepartMentServiceImpl implements DepartMentService {


    @Autowired
    private DepartMentMapper departMentMapper;
    @Override
    public List<DepartMent> getAllList() {
        List<DepartMent> departMentList = departMentMapper.queryAll();
        HashMap<String, List<DepartMent>> deptMap = new HashMap<>();

        for (DepartMent departMent : departMentList) {
            List<DepartMent> departMents = deptMap.getOrDefault(departMent.getP_id(),new ArrayList<DepartMent>());
            departMents.add(departMent);
            deptMap.put(departMent.getP_id(),departMents);
        }

        return departMentList;
    }

    public List<DepartMent> getZDept(HashMap<String, List<DepartMent>> deptMap, DepartMent currDept){
        // 如果当前节点为null ,回退
        if(null == currDept)
            return null;
        //
        ArrayList<DepartMent> result = new ArrayList<>();
        if (null==currDept.getP_id())
            return result;




        return result;
    }

    @Override
    public DepartMent getByDeptId(String dept_id) {

        DepartMent dept = departMentMapper.getByDeptId(dept_id);

        return dept;
    }

    @Override
    public DepartMent getAllDepartmentsByParentId(String dept_id) {
        return departMentMapper.getAllDepartmentsByParentId(dept_id);
    }
}
