package com.itxiaobai.wx.bean;

public class Person {

    public Person() {
        System.out.println("person 构造器");
    }

    public void init(){
        System.out.println("person init method");
    }

    public void destroy(){
        System.out.println("person destroy method");
    }
}
