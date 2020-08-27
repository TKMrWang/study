package com.itxiaobai.wx.config;

import com.itxiaobai.wx.aspect.MyAspect;
import com.itxiaobai.wx.bean.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class MyConfig {

    @Bean
    public Calculator calculator(){
        return  new Calculator();
    }

    @Bean
    public MyAspect myAspect(){
        return new MyAspect();
    }
}
