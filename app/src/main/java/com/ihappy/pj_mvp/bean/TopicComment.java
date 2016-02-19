package com.ihappy.pj_mvp.bean;

/**
 * Created by liuhuan-mac on 15/12/1.
 */
public class TopicComment {
    /**id	Long	评论ID
    author	Account	评论者
    content	String	评论正文
    type	TopicCommentType	评论或评论的回复	COMMENT、REPLY
    parent	TopicComment	被评论的父级评论引用
    likesCount	Integer	赞数
    createdAt	Datetime	创建时间
    updatedAt	Datetime	更新时间
    **/
    private Integer id;

    private Author author;

    private String content;

    private String type;

    private TopicComment parent;

    private Integer likesCount;

    private String createdAt;

    private String updatedAt;


    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }

    public TopicComment getParent() {
        return parent;
    }

    public void setParent(TopicComment parent) {
        this.parent = parent;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TopicComment(){}

    public TopicComment(String content)
    {
        this.content=content;
    }
}
