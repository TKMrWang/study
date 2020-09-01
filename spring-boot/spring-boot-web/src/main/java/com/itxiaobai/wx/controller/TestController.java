package com.itxiaobai.wx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @RequestMapping("/success")
    public String success(){
        return "success";
    }
}
