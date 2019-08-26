package com.miracle.ca.back.article.service;

import com.alibaba.druid.support.json.JSONUtils;
import com.miracle.ca.back.article.entity.CaArticle;
import com.miracle.ca.back.article.entity.Recieve;
import com.miracle.ca.back.article.mapper.CaArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: createAngel
 * @description:
 * @author: miracle
 * @create: 2019-08-19 09:52
 **/

@Service
public class ArticleService {

    @Autowired
    CaArticleMapper articleMapper;

    public String upload(Recieve recieve){
        CaArticle caArticle = new CaArticle();
        caArticle.setTitle(recieve.getTitle());
        caArticle.setMain(recieve.getMain());
        caArticle.setHtmlContent(recieve.getHtmlContent());
        caArticle.setCommentNum(0);
        caArticle.setConmmentList(JSONUtils.toJSONString(new ArrayList<String>()));
        caArticle.setUser("admin");
        caArticle.setCreateTime(new Date());
        articleMapper.upload(caArticle);
        return "200";
    }

    public List<CaArticle> getArticle(int offset){
        return articleMapper.getArticle(offset);
    }

    public CaArticle getArticleById(int id){
        return articleMapper.getArticleById(id);
    }

}
