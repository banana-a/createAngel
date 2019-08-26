package com.miracle.ca.back.comment.mapper;

import com.miracle.ca.back.comment.entity.CaArticle;
import com.miracle.utils.MyMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface CaArticleMapper extends MyMapper<CaArticle> {
    public void addCommentNum(int articleId);
}