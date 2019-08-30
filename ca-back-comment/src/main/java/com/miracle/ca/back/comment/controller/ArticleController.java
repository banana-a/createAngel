package com.miracle.ca.back.comment.controller;

import com.miracle.ca.back.comment.entity.CaArticle;
import com.miracle.ca.back.comment.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: createAngel
 * @description:
 * @author: miracle
 * @create: 2019-08-30 10:58
 **/

@RestController
@CrossOrigin
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @GetMapping(value = "/getArticleByTitle/{title}")
    public CaArticle getArticleByTitle(@PathVariable String title){
        return articleService.getArticleByTitle(title);
    }
}
