package com.itxiaobai.wx.config;

import com.itxiaobai.wx.bean.Color;
import com.itxiaobai.wx.bean.Person;
import com.itxiaobai.wx.bean.Red;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * import 快速引入组件,组件id默认为类全路径
 * 注册组件的方式：
 *  1.包扫描+注解方式(@Component/@Controller/@Service/@Repository)
 *  2.@Bean()方式
 *  3.@Import 快速导入组件
 *      1)@Import(要导入组件)，容器中就会自动注册组件，id默认为类的全路径
 *      2）通过ImportSelector方式向容器中注册组件（myconfig2），需要自己实现ImportSelector，
 *          返回值是是我们实际上要导入到容器中的组件全类名，返回值可以是空数组，但是不能为null，否则会报空指针异常
 *      3）通过ImportBeanDefinitionRegistrar的方式手动注册bean到容器中
 */
@Configuration
@Import({Color.class, Red.class})
public class MyConfig {

    @Bean("zhangsan")
    public Person person(){
        return new Person("zhangsan",16);
    }

    @Bean("lisi")
    public Person person1(){
        return new Person("lisi",20);
    }
}
