package com.itxiaobai.wx.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    private int flag;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "flag=" + flag +
                '}';
    }
}
