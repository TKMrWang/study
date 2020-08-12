package com.itxiaobai.wx.config;

import com.itxiaobai.wx.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//配置类，等同于配置文件
@Configuration//配置类注解，告诉spring这是一个配置类
public class MyConfig {

    //注册一个bean,id默认为方法名，也可以用Bean(id名)定义bean的id
    @Bean
    public User user(){
        return new User("张三",15);
    }
}
