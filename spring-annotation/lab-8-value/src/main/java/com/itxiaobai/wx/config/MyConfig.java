package com.itxiaobai.wx.config;

import com.itxiaobai.wx.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = "classpath:person.properties",encoding = "utf-8")
@ComponentScan("com.itxiaobai.wx")
public class MyConfig {

    @Bean
    public Person person(){
        return new Person();
    }
}
