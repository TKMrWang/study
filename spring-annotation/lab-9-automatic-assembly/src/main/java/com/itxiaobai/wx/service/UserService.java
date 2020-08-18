package com.itxiaobai.wx.service;

import com.itxiaobai.wx.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

//    @Qualifier("userDao")
    @Autowired
    private UserDao userDao;

    public void print(){
        System.out.println(userDao);
    }

    @Override
    public String toString() {
        return "UserService{" +
                "userDao=" + userDao +
                '}';
    }
}
