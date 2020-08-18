package com.itxiaobai.wx.config;

import com.itxiaobai.wx.dao.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@ComponentScan("com.itxiaobai.wx")
@Configuration
public class MyConfig {

    @Primary
    @Bean("userDao2")
    public UserDao userDao(){
        UserDao userDao = new UserDao();
        userDao.setFlag(2);
        return userDao;
    }
}
