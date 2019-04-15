package com.zbq.entity;

import lombok.Data;

/**
 * @ClassName User 用户信息
 * @Author zbq
 * @Date 2019/4/15 10:47
 * @Version 1.0
 **/

@Data
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String email;
    private String creattime;
}
