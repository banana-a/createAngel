package com.miracle.ca.back.comment.service;

import com.miracle.ca.back.comment.entity.CaCommentTwo;
import com.miracle.ca.back.comment.mapper.CaCommentOneMapper;
import com.miracle.ca.back.comment.mapper.CaCommentTwoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: createAngel
 * @description:
 * @author: miracle
 * @create: 2019-08-23 16:34
 **/

@Service
public class CommentTwoService {

    @Autowired
    CaCommentOneMapper oneMapper;

    @Autowired
    CaCommentTwoMapper twoMapper;

    public void insertCommentTwo(CaCommentTwo caCommentTwo){
        twoMapper.insertCommentTwo(caCommentTwo);
        oneMapper.addCommentOneNum(caCommentTwo.getOneId());
    }

    public List<CaCommentTwo> getCommentTwo(int id){
        return twoMapper.getCommentTwo(id);
    }
}
