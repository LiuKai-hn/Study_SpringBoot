show databases;

create database study_springboot;

show create table my_user;


drop table my_user;
CREATE TABLE `my_user` (
                           `id` int auto_increment not null ,
                           `username` varchar(255) DEFAULT NULL,
                           `password` varchar(255) NOT NULL,
                           `age` int DEFAULT NULL,
                           `sex` varchar(10) DEFAULT NULL,
                           primary key (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
;




CREATE TABLE user
(
    id BIGINT(20) NOT NULL COMMENT '主键ID',
    name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
    age INT(11) NULL DEFAULT NULL COMMENT '年龄',
    email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
    PRIMARY KEY (id)
);


INSERT INTO user (id, name, age, email) VALUES
                                            (1, 'Jone', 18, 'test1@baomidou.com'),
                                            (2, 'Jack', 20, 'test2@baomidou.com'),
                                            (3, 'Tom', 28, 'test3@baomidou.com'),
                                            (4, 'Sandy', 21, 'test4@baomidou.com'),
                                            (5, 'Billie', 24, 'test5@baomidou.com');


select * from user;


ALTER TABLE USER ADD VERSION INT DEFAULT 1 ;  # int 类型 乐观锁字段

