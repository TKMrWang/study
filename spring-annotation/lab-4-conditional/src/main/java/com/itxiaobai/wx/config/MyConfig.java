package com.itxiaobai.wx.config;

import com.itxiaobai.wx.bean.Person;
import com.itxiaobai.wx.condition.LinuxCondition;
import com.itxiaobai.wx.condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Conditional 按条件注册bean
 */
@Configuration
public class MyConfig {

    @Conditional({WindowsCondition.class})
    @Bean("zhangsan")
    public Person person(){
        return new Person("zhangsan",16);
    }

    @Conditional({LinuxCondition.class})
    @Bean("lisi")
    public Person person1(){
        return new Person("lisi",20);
    }
}
