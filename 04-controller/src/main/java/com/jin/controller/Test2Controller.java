package com.jin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test2Controller {

    @RequestMapping("/t2")
    public String test(Model model) {
        model.addAttribute("msg", "Test 2 Controller");
        return "test";
    }
}
