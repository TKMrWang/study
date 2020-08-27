package com.itxiaobai.wx.service;

import com.itxiaobai.wx.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;


    public  void  insertUser(){
        userDao.insert();
        System.out.println("插入完成");
        int res = 10 / 0;
    }

    //标记当前方法是一个事务方法
    @Transactional
    public  void  insertUserTx(){
        userDao.insert();
        System.out.println("事务方法插入完成");
        int res = 10 / 0;
    }
}
