package com.liukai.mapper;

import com.liukai.pojo.TableComment;

import java.util.List;

public interface GetTableComment {

    List<TableComment> queryDatabase(String dbName);

    List<TableComment> queryTableByCommentLike(String dbName,String tableCommLike);
    List<TableComment> queryAllDatabase();

    List<String> getDBs();
}
