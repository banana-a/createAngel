package com.miracle.ca.back.ui.controller;

import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @program: createAngel
 * @description:
 * @author: miracle
 * @create: 2019-08-19 20:14
 **/

@CrossOrigin
@RestController
public class UploadController {

    @PostMapping(value = "/uploadFile")
    public String uploadFile(@RequestBody MultipartFile dropFile, HttpServletRequest request) throws IOException {
        File file = new File(ResourceUtils.getURL("classpath:").getPath());
        File upload = new File(file.getAbsolutePath(),"static/images/");
        if(!upload.exists()) upload.mkdirs();
        String fileName = dropFile.getOriginalFilename();
        String filePath = upload.getPath();
        file = new File(filePath,fileName);
        dropFile.transferTo(file);
        return "200";
    }



}
