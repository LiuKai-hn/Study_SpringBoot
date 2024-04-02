package com.liukai.controller;

import com.liukai.pojo.ColumnComment;
import com.liukai.service.ColumnCommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("col")
public class ColCommentController {

    @Autowired
    private ColumnCommentService columnCommentService;

    /**
     * 获取单张表的注释
     * @param dbname 库名称
     * @param tbname 表名称
     * @return
     */
    @GetMapping("/getColCommentByDBTableName/{dbname}/{tbname}")
    @ResponseBody
    public List<ColumnComment> getTableComByDB(@PathVariable("dbname") String dbname,@PathVariable("tbname") String tbname){
        List<ColumnComment> tableComment = columnCommentService.getColCommentByDBAndTbName(dbname,tbname);
        log.info("查询的tableComment数据为:{}",tableComment);
        return tableComment;
    }


    @GetMapping("/getTableInfoListByColComment/{colcommname}")
    @ResponseBody
    public List<ColumnComment> getTbleInfoByColComm(@PathVariable("colcommname") String colcommname){
        List<ColumnComment> tableCommentlist = columnCommentService.getTbleInfoByColComm(colcommname);
        log.info("查询的tableComment数据为:{}",tableCommentlist);
        return tableCommentlist;
    }





}
