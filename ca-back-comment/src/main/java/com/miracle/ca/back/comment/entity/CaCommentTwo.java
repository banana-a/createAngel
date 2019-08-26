package com.miracle.ca.back.comment.entity;

import javax.persistence.*;

@Table(name = "ca..ca_comment_two")
public class CaCommentTwo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "one_id")
    private Integer oneId;

    private String openid;

    private String username;

    private String comment;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return one_id
     */
    public Integer getOneId() {
        return oneId;
    }

    /**
     * @param oneId
     */
    public void setOneId(Integer oneId) {
        this.oneId = oneId;
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

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}