package com.miracle.ca.back.article.controller;

import com.miracle.ca.back.article.entity.CaUser;
import com.miracle.ca.back.article.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: createAngel
 * @description:
 * @author: miracle
 * @create: 2019-08-22 13:17
 **/

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/getUser")
    public CaUser getUser(@RequestParam String openid){
        return userService.getUser(openid);
    }

    @PostMapping(value = "/stopUser/{stopUser}/{stopTime}")
    public String stopUser(@PathVariable String stopUser,@PathVariable int stopTime){
        userService.stopUser(stopUser, stopTime);
        return "200";
    }
}
