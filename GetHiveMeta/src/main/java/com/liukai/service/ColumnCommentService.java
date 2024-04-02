package com.liukai.service;

import com.liukai.mapper.GetColumnComment;
import com.liukai.pojo.ColumnComment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ColumnCommentService {

    @Autowired
    private GetColumnComment getColumnComment;


    public List<ColumnComment> getColCommentByDBAndTbName(String dbName, String tbName){

        List<ColumnComment> columnComment = getColumnComment.queryColCommByDBAndTbName(dbName, tbName);

        return columnComment;
    }

    public List<ColumnComment> getTbleInfoByColComm(String colcommname) {

        List<ColumnComment> columnCommentList = getColumnComment.getTbleInfoByColComm(colcommname);

        return columnCommentList;
    }
}
