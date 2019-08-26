package com.miracle.ca.back.comment.mapper;

import com.miracle.ca.back.comment.entity.CaCommentTwo;
import com.miracle.utils.MyMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaCommentTwoMapper extends MyMapper<CaCommentTwo> {
    public void insertCommentTwo(CaCommentTwo caCommentTwo);
    public List<CaCommentTwo> getCommentTwo(int id);
}