package com.jin.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.jin.pojo.User;
import com.jin.utils.JsonUtils;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class UserController {

    @RequestMapping("/j1")
    @ResponseBody
    public String json() {
        User user = new User();
        user.setName("张三");
        user.setAge(3);
        user.setSex("男");
        return JsonUtils.getJson(user);
    }

    @RequestMapping("/j2")
    @ResponseBody
    public String json2() {
        Date date = new Date();
        return JsonUtils.getJson(date, "yyyy-MM-dd HH:mm:ss");
    }
}
