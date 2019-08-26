package com.miracle.ca.back.comment.controller;

import com.miracle.ca.back.comment.entity.CaCommentOne;
import com.miracle.ca.back.comment.service.CommentOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: createAngel
 * @description:
 * @author: miracle
 * @create: 2019-08-22 21:23
 **/

@RestController
public class CommentOneController {

    @Autowired
    CommentOneService commentOneService;

    @PostMapping(value = "/doCommentOne")
    public String doCommentOne(@RequestBody CaCommentOne caCommentOne){
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
}
