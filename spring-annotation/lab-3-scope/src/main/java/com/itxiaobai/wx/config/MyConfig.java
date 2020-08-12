package com.itxiaobai.wx.config;

import com.itxiaobai.wx.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * scope默认单实例，
 * prototype 多实例
 * singleton 单实例
 * web request
 * web session
 * 单实例在容器启动时 创建实例，每次使用时直接从容器获取
 *
 * 多实例在IOC容器创建完成后在需要获取实例调用时创建实例，每次获取时都会调用
 */
@Configuration
public class MyConfig {

    //默认单实例
    @Bean
    public Person person(){
        System.out.println("单实例向容器中添加bean");
        return new Person("zhangsan",15);
    }

    //多实例实例
    @Bean
    @Scope("prototype")
    public Person person1(){
        System.out.println("多实例向容器中添加bean");
        return new Person("zhangsan",15);
    }
}
