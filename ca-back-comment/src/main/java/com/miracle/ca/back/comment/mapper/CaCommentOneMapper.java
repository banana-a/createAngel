package com.miracle.ca.back.comment.mapper;

import com.miracle.ca.back.comment.entity.CaCommentOne;
import com.miracle.utils.MyMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaCommentOneMapper extends MyMapper<CaCommentOne> {
    public void insertCommentOne(CaCommentOne caCommentOne);
    public List<CaCommentOne> getCommentOne(String id);
    public void addCommentOneNum(int commentId);
    public List<CaCommentOne> getMyComment(String openid);
}