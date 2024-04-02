package com.liukai.controller;

import com.liukai.pojo.TableComment;
import com.liukai.service.TableCommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("table")
public class HiveController {


    @Autowired
    private TableCommentService tableCommentService;

    @GetMapping("/getdbtablelist/{dbname}")
    @ResponseBody
    public List<TableComment> getTableCommListByDB(@PathVariable("dbname") String dbname){
        List<TableComment> tableCommentList = tableCommentService.getTableCommListByDB(dbname);
        log.info("查询的tableComment数据为:{}",tableCommentList);
        return tableCommentList;
    }

    @GetMapping("/getdbs")
    @ResponseBody
    public List<String> getTableCommListByDB(){
        List<String> dbs = tableCommentService.getDBs();
        log.info("查询的tableComment数据为:{}",dbs);
        return dbs;
    }

    @GetMapping("/getalldbtablelist")
    @ResponseBody
    public List<TableComment> getAllDBTableCommListByDB(){
        List<TableComment> tableCommentList = tableCommentService.getAllDBTableCommList();
        log.info("查询的tableComment数据为:{}",tableCommentList);
        return tableCommentList;
    }
    @GetMapping("/getDBTBlistByTBCommLike/{dbName}/{tableCommLike}")
    @ResponseBody
    public List<TableComment> queryTableByCommentLike(@PathVariable(value = "dbName", required = true) String dbName,
                                                      @PathVariable(value = "tableCommLike", required = true) String tableCommLike){
        List<TableComment> tableCommentList = tableCommentService.queryTableByCommentLike(dbName,tableCommLike);
        log.info("查询的tableComment数据为:{}",tableCommentList);
        return tableCommentList;
    }



}
