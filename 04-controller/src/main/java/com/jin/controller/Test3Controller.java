package com.jin.controller;

import com.jin.pojo.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Test3Controller {

    @PostMapping("/t3")
    public String test(User user) {
        System.out.println(user);
        return "test";
    }
}
