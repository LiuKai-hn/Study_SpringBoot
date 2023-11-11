package com.liukai.pojo;

import lombok.Data;

import java.util.List;

@Data
public class DepartMent {

    // 部门id
    private String dept_id;
    // 部门名称
    private String dept_name;

    private String p_id;
    // 下级部门id
    private List<DepartMent> departMentList;
}
