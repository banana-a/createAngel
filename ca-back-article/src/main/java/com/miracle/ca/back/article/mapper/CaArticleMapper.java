package com.miracle.ca.back.article.mapper;

import com.miracle.ca.back.article.entity.CaArticle;
import com.miracle.utils.MyMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaArticleMapper extends MyMapper<CaArticle> {
    public void upload(CaArticle caArticle);
    public List<CaArticle> getArticle(int offset);
    public CaArticle getArticleById(int id);
}