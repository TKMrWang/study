package com.itxiaobai.wx.repository;

import com.itxiaobai.wx.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
