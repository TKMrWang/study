package com.itxiaobai.wx.config;


import com.itxiaobai.wx.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:profile.properties")
public class MyConfig {


    @Profile("dev")
    @Bean("personDev")
    public Person devPerson(){
        Person person = new Person();
        person.setName("开发");
        person.setAge(1);
        return person;
    }

    @Profile("test")
    @Bean("personTest")
    public Person testPerson(){
        Person person = new Person();
        person.setName("测试");
        person.setAge(2);
        return person;
    }

}
