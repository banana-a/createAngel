package com.miracle.ca.back.comment.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ca..ca_article")
public class CaArticle {
    @Id
    @Column(name = "article_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer articleId;

    private String title;

    @Column(name = "comment_num")
    private Integer commentNum;

    @Column(name = "conmment_list")
    private String conmmentList;

    private String user;

    @Column(name = "create_time")
    private Date createTime;

    private String main;

    @Column(name = "html_content")
    private String htmlContent;

    /**
     * @return article_id
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * @param articleId
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return comment_num
     */
    public Integer getCommentNum() {
        return commentNum;
    }

    /**
     * @param commentNum
     */
    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    /**
     * @return conmment_list
     */
    public String getConmmentList() {
        return conmmentList;
    }

    /**
     * @param conmmentList
     */
    public void setConmmentList(String conmmentList) {
        this.conmmentList = conmmentList;
    }

    /**
     * @return user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return main
     */
    public String getMain() {
        return main;
    }

    /**
     * @param main
     */
    public void setMain(String main) {
        this.main = main;
    }

    /**
     * @return html_content
     */
    public String getHtmlContent() {
        return htmlContent;
    }

    /**
     * @param htmlContent
     */
    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }
}