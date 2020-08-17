package com.itxiaobai.wx.config;

import com.itxiaobai.wx.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig2 {



    @Scope("prototype")
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Person person(){
        return new Person();
    }
}
