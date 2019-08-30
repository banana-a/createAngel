package com.miracle.ca.back.comment.service;

import com.miracle.ca.back.comment.entity.CaArticle;
import com.miracle.ca.back.comment.mapper.CaArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: createAngel
 * @description:
 * @author: miracle
 * @create: 2019-08-30 10:57
 **/

@Service
public class ArticleService {

    @Autowired
    CaArticleMapper articleMapper;

    public CaArticle getArticleByTitle(String title){
        return articleMapper.getArticleByTitle(title);
    }

}
