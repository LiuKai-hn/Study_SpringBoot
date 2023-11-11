package com.liukai.pojo;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class User {

    private String id;
    private String username ;
    private String password ;
    private Integer age ;
    private String sex ;
}
