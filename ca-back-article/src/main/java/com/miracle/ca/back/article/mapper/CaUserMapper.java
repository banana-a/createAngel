package com.miracle.ca.back.article.mapper;

import com.miracle.ca.back.article.entity.CaUser;
import com.miracle.utils.MyMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface CaUserMapper extends MyMapper<CaUser> {

    public void insertUser(String openid);

    public CaUser selectUser(String openid);
}