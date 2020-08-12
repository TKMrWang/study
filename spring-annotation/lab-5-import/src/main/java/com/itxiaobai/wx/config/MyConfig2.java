package com.itxiaobai.wx.config;

import com.itxiaobai.wx.bean.Color;
import com.itxiaobai.wx.bean.Person;
import com.itxiaobai.wx.bean.Red;
import com.itxiaobai.wx.myselector.MyImportSelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @import第二种使用方式
 * 通过ImportSelector方式
 */
@Configuration
@Import({MyImportSelector.class})
public class MyConfig2 {

    @Bean("zhangsan")
    public Person person(){
        return new Person("zhangsan",16);
    }

    @Bean("lisi")
    public Person person1(){
        return new Person("lisi",20);
    }
}
