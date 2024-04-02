package com.liukai.pojo;

import lombok.Data;

@Data
public class ColumnComment {

    private String dbName;
    private String tableName;
    private String tableComment;
    private String columnName;
    private String columnComment;
}
