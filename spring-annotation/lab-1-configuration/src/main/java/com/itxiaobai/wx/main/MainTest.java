package com.itxiaobai.wx.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.itxiaobai.wx.bean.User;
import com.itxiaobai.wx.config.MyConfig;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = applicationContext.getBean(User.class);
        System.out.println(user);
    }
}
