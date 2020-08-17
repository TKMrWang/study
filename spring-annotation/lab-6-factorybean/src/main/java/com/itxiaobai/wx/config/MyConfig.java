package com.itxiaobai.wx.config;

import com.itxiaobai.wx.bean.Person;
import com.itxiaobai.wx.factory.PersonFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public PersonFactoryBean personFactoryBean(){
        return  new PersonFactoryBean();
    }
}
