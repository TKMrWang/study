package com.itxiaobai.wx.config;

import com.itxiaobai.wx.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

//配置类，等同于配置文件
@Configuration//配置类注解，告诉spring这是一个配置类
//@ComponentScan(value = "com.itxiaobai")//包扫描，制定扫描的包
//只掉扫描除包下@Controller注解之外
//@ComponentScan(value = "com.itxiaobai",excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
//})
//只扫描包下@Controller注解
//FilterType.ANNOTATION 按照注解类型
//FilterType.ASSIGNABLE_TYPE 按照给定的类型
//FilterType.ASPECTJ 按照aspectj表达式
//FilterType.REGEX 按照正则表达式
//FilterType.CUSTOM 自定义规则
@ComponentScan(value = "com.itxiaobai",includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class}),
//        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {UserService.class}),
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyFilterType.class})
},useDefaultFilters = false)
public class MyConfig {

}
