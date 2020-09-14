package com.itxiaobai.wx.bean;

import lombok.Data;

import javax.persistence.*;

//使用jpa注解配置映射关系
@Data
@Entity//告诉jpa这是一个和数据表映射的类
@Table(name = "tb_user")//@table指定和哪个数据表映射，如果省略，默认表明就是user
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name",length = 50)//
    private String lastName;

    @Column
    private Integer age;
}
