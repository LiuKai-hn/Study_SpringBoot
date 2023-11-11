package org.example.controller;

import org.example.properties.DataSourceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private DataSourceProperties dataSourceProperties;

    @Value("${spring.jdbc.datasource.username}")
    private String username;
    @GetMapping("boot")
    public String index(){
        System.out.println(dataSourceProperties);
        return "hello,"+username;
    }
}
