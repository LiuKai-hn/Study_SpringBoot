package com.liukai.pojo;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class User {

    private Long id;
    private String name;
    private Integer age;
    private String email;
    private Integer deleted;
    @Version
    private Integer version;
}
