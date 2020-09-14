package com.itxiaobai.wx.controller;

import com.itxiaobai.wx.bean.User;
import com.itxiaobai.wx.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController()
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public Optional<User> getUserById(@PathVariable("id") Integer id){
        return userRepository.findById(id);
    }

    @GetMapping("/user")
    public User insert(User user){
        return userRepository.save(user);
    }
}
