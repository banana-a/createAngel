package com.miracle.ca.back.comment.controller;

import com.miracle.ca.back.comment.entity.CaCommentOne;
import com.miracle.ca.back.comment.entity.TitleUser;
import com.miracle.ca.back.comment.service.CommentOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: createAngel
 * @description:
 * @author: miracle
 * @create: 2019-08-22 21:23
 **/

@CrossOrigin
@RestController
public class CommentOneController {

    @Autowired
    CommentOneService commentOneService;

    @Autowired
    RedisTemplate redisTemplate;

    @PostMapping(value = "/doCommentOne")
    public String doCommentOne(@RequestBody CaCommentOne caCommentOne){
        if (redisTemplate.hasKey(caCommentOne.getUsername())) return "404";
        if (caCommentOne.getComment().equals("")) return "404";
        commentOneService.doCommentOne(caCommentOne);
        return "200";
    }

    @GetMapping(value = "/getCommentOne/{id}")
    public List<CaCommentOne> getCommentOne(@PathVariable String id){
        return commentOneService.getCommentOne(id);
    }

    @GetMapping(value = "/getMyComment/{openid}")
    public List<CaCommentOne> getMyComment(@PathVariable String openid){
        return commentOneService.getMyComment(openid);
    }

    @PostMapping(value = "/delCommentOne/{delCtitle}/{delUsername}")
    public String delCommentOne(@PathVariable String delCtitle,@PathVariable String delUsername){
        System.out.println(delCtitle);
        System.out.println(delUsername);
        commentOneService.deleteCommentOne(delCtitle, delUsername);
        return "200";
    }
}
