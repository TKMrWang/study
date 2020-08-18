package com.itxiaobai.wx.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Person {

    /**
     * 使用@Value()赋值，支持以下方式
     * 1、基本数值
     * 2、#{}表达式
     * 3、${}取出配置文件中的值,@PropertySource指定外部配置文件
     */
    @Value("张三")
    private String name;

    @Value("#{22-2}")
    private int age;

    @Value("${person.address}")
    private String address;

    public Person() {
        System.out.println("person 无参构造器");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
