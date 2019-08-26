package com.miracle.ca.back.slider.controller;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

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
    public String uploadFile(@RequestBody MultipartFile dropFile, HttpServletRequest request){
        System.out.println(request.getSession().getServletContext().getRealPath("/"));
        return "200";
    }

}
