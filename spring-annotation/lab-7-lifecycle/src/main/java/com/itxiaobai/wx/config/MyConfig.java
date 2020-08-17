package com.itxiaobai.wx.config;

import com.itxiaobai.wx.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@ComponentScan("com.itxiaobai.wx.bean")
@Configuration
public class MyConfig {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Person person(){
        return new Person();
    }



}
