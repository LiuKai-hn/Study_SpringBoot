package com.liukai.controller;

import com.liukai.service.HiveExecService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@Slf4j
@RestController
@RequestMapping("hive")
public class HiveExecController {

    @Autowired
    private HiveExecService hiveExecService;

    @GetMapping("/query/{query}")
    @ResponseBody
    public void executeHiveQuery(@PathVariable("query") String query) {
        try {
            System.out.println("query = " + query);
            hiveExecService.executeHiveQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
            // 处理异常
        }
    }
}
