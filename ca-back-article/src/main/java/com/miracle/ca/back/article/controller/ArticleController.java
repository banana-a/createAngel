package com.miracle.ca.back.article.controller;

import com.miracle.ca.back.article.entity.CaArticle;
import com.miracle.ca.back.article.entity.Recieve;
import com.miracle.ca.back.article.service.ArticleService;
import com.miracle.ca.back.article.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * @program: createAngel
 * @description:
 * @author: miracle
 * @create: 2019-08-19 12:27
 **/

@RestController
@CrossOrigin
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @Autowired
    UserService userService;

    @PostMapping(value = "/uploadArticle")
    public String uploadArticle(@RequestBody Recieve recieve){
        return articleService.upload(recieve);
    }

    @RequestMapping(value = "/getArticle/{offset}")
    public List<CaArticle> getArticle(@PathVariable int offset){
        List<CaArticle> articles = articleService.getArticle(offset);
        return articles;
    }

    @GetMapping(value = "/getArticleById/{id}")
    public CaArticle getArticleById(@PathVariable int id){
        return articleService.getArticleById(id);
    }

    @GetMapping(value = "/doLogin")
    public String doLogin(@RequestParam String code){
        return userService.doLogin(code);
    }
}
