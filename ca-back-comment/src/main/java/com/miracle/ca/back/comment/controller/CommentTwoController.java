package com.miracle.ca.back.comment.controller;

import com.miracle.ca.back.comment.entity.CaCommentOne;
import com.miracle.ca.back.comment.entity.CaCommentTwo;
import com.miracle.ca.back.comment.service.CommentOneService;
import com.miracle.ca.back.comment.service.CommentTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: createAngel
 * @description:
 * @author: miracle
 * @create: 2019-08-23 16:41
 **/


@RestController
public class CommentTwoController {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    CommentTwoService commentTwoService;

    @PostMapping(value = "/doCommentTwo")
    public String doCommentTwo(@RequestBody CaCommentTwo caCommentTwo){
        if (redisTemplate.hasKey(caCommentTwo.getUsername())) return "404";
        if (caCommentTwo.getComment().equals("")) return "404";
        commentTwoService.insertCommentTwo(caCommentTwo);
        return "200";
    }

    @GetMapping(value = "getCommentTwo/{id}")
    public List<CaCommentTwo> getCommentTwo(@PathVariable int id){
        return commentTwoService.getCommentTwo(id);
    }
}