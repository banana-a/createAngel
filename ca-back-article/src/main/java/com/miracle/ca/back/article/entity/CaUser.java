package com.miracle.ca.back.article.entity;

import javax.persistence.*;

@Table(name = "ca..ca_user")
public class CaUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer username;

    private String openid;

    /**
     * @return username
     */
    public Integer getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(Integer username) {
        this.username = username;
    }

    /**
     * @return openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * @param openid
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }
}