package com.jin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class FileController {

    @RequestMapping("/upload")
    public String upload(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) throws IOException {
        String path = request.getServletContext().getRealPath("/upload");
        File realPath = new File(path);
        if (!realPath.exists()) {
            realPath.mkdir();
        }
        file.transferTo(new File(realPath + File.separator + file.getOriginalFilename()));
        return "redirect:/index.jsp";
    }

    @RequestMapping("/download")
    public void download(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String path = request.getServletContext().getRealPath("/upload");

        String fileName = "图片.png";

        response.reset(); // 设置页面不缓存，清空缓存
        response.setCharacterEncoding("UTF-8"); // 字符编码
        response.setContentType("multipart/form-data"); // 二进制数据
        response.setHeader("Content-Disposition", "attachment;fileName=" + URLEncoder.encode(fileName, "UTF-8"));

        StreamUtils.copy(new FileInputStream(new File(path, fileName)), response.getOutputStream());
    }

}
