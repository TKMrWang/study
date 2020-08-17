package com.itxiaobai.wx.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class User implements InitializingBean, DisposableBean {

    public User() {
        System.out.println("user 构造器");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("user------destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("user init");
        System.out.println("user afterPropertiesSet");
    }
}
