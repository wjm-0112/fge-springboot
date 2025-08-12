package com.neu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("upload")
public class UploadController {
    @RequestMapping(value = "/upload")
    @ResponseBody
    public String upload(MultipartFile file, HttpServletRequest request) throws IOException {
        //创建文件名
        String fileName = "";
        if(!file.isEmpty()){
            //获取前端上传的文件名
            fileName = file.getOriginalFilename();
            System.out.println("文件名："+fileName);
            //定义上传的路径
            String path ="E:\\javaProgram\\Vue\\fge\\src\\components\\img";
            //创建一个新的文件
            File file1 = new File(path,fileName);
            //将文件写入磁盘中
            file.transferTo(file1);
        }

        return fileName;
    }
}
