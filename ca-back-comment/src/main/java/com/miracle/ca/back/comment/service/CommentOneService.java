package com.miracle.ca.back.comment.service;

import com.miracle.ca.back.comment.entity.CaCommentOne;
import com.miracle.ca.back.comment.mapper.CaArticleMapper;
import com.miracle.ca.back.comment.mapper.CaCommentOneMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: createAngel
 * @description:
 * @author: miracle
 * @create: 2019-08-22 21:11
 **/

@Service
public class CommentOneService {

    @Autowired
    CaCommentOneMapper caCommentOneMapper;

    @Autowired
    CaArticleMapper articleMapper;

    @Autowired
    RedisTemplate redisTemplate;

    public void doCommentOne(CaCommentOne caCommentOne){
        caCommentOneMapper.insertCommentOne(caCommentOne);
        articleMapper.addCommentNum(caCommentOne.getArticleId());
    }

    public List<CaCommentOne> getCommentOne(String id){
        return caCommentOneMapper.getCommentOne(id);
    }

    public List<CaCommentOne> getMyComment(String openid){
        return caCommentOneMapper.getMyComment(openid);
    }

    public void deleteCommentOne(String title,String username){
        int id = articleMapper.getArticleByTitle(title).getArticleId();
        caCommentOneMapper.deleteCommentOne(id, username);
    }
}
