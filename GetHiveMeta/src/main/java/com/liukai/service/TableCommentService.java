package com.liukai.service;

import com.liukai.mapper.GetTableComment;
import com.liukai.pojo.TableComment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class TableCommentService {

    @Autowired
    private GetTableComment getTableComment;

    public List<TableComment> getTableCommListByDB(String dbName){
        List<TableComment> tableComments = getTableComment.queryDatabase(dbName);

        return tableComments;
    }

    public List<TableComment> queryTableByCommentLike(String dbName,String tableCommLike){
        List<TableComment> tableComments = getTableComment.queryTableByCommentLike( dbName,tableCommLike);

        return tableComments;
    }

    public List<TableComment> getAllDBTableCommList(){
        List<TableComment> tableComments = getTableComment.queryAllDatabase();

        return tableComments;
    }

    public List<String> getDBs() {
        List<String> dbs = getTableComment.getDBs();

        return dbs;
    }
}
