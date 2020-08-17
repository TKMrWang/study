package com.itxiaobai.wx.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog {

    public Dog() {
        System.out.println("dog 构造器");
    }

    @PostConstruct
    public void init(){
        System.out.println("dog init ---->dog  @PostConstruct");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("dog destroy --->dog @PreDestroy");
    }
}
