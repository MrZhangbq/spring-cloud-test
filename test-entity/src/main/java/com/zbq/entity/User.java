package com.zbq.entity;

import lombok.Data;

/**
 * @ClassName User 用户
 * @Author zbq
 * @Date 2019/4/15 10:47
 * @Version 1.0
 **/

@Data
public class User {
    //用户Id
    private Integer id;
    //用户姓名
    private String name;
    //用户年龄
    private Integer age;
    //用户邮箱
    private String email;
    //创建时间
    private String creattime;
}
