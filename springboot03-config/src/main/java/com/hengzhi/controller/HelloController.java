package com.hengzhi.controller;

import com.hengzhi.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    User user;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello(){
        return "Hello SpringBoot 03";
    }

    @RequestMapping(value = "/getUser")
    @ResponseBody
    public User getUser(){
        return user;
    }
}
