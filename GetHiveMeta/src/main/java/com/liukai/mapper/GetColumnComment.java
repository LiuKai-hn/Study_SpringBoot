package com.liukai.mapper;

import com.liukai.pojo.ColumnComment;

import java.util.List;

public interface GetColumnComment {

    /**
     * 获取某张表的字段注释
     * @param dbName
     * @param tbName
     * @return
     */
    List<ColumnComment> queryColCommByDBAndTbName(String dbName, String tbName);

    /**
     * 通过 字段注释获取表信息
     * @param colcommname
     * @return
     */
    List<ColumnComment> getTbleInfoByColComm(String colcommname);
}
