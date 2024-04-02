package com.liukai.service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Service
public class HiveExecService {
    @Value("${hive.url}")
    private String hiveUrl;

    @Value("${hive.username}")
    private String hiveUsername;

    @Value("${hive.password}")
    private String hivePassword;

    public void executeHiveQuery(String query) throws SQLException {
        try (Connection connection = DriverManager.getConnection(hiveUrl, hiveUsername, hivePassword);
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            // 处理查询结果
            while (resultSet.next()) {
                // 获取结果集中的数据
                String data = resultSet.getString("column_name");
                System.out.println(data);
            }
        }
    }
}