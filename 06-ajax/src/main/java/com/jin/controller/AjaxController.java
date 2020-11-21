package com.jin.controller;

import com.jin.pojo.User;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;


@RestController
public class AjaxController {

    @RequestMapping("/t1")
    public String test() {
        return "hello";
    }

    @RequestMapping("/checkUsername")
    public void checkUsername(String name, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        if ("admin".equals(name)) {
            writer.print("true");
        } else {
            writer.print("false");
        }
    }

    @RequestMapping("/getUsers")
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("小明", 3, "男"));
        users.add(new User("小亮", 6, "男"));
        users.add(new User("小红", 7, "女"));
        return users;
    }

    @RequestMapping("/checkUser")
    public String checkName(String username, String password) {
        String msg = "";
        if (username != null) {
            if ("admin".equals(username)) {
                msg = "ok";
            } else {
                msg = "用户名错误";
            }
        }
        if (password != null) {
            if ("123456".equals(password)) {
                msg = "ok";
            } else {
                msg = "密码错误";
            }
        }
        return msg;
    }
}
