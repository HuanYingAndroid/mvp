package com.ihappy.pj_mvp.bean;
import java.util.ArrayList;
import se.emilsjolander.sprinkles.Model;

/**
 * Created by liuhuan-mac on 15/11/23.
 */
public class Topic extends Model {
    private Integer id;

    private String title;

    private String content;

    private Author author;

    private String cover;

    private String color;

    private ArrayList<String> photos;

    private ArrayList<Item> items;

    private ArrayList<Album> albums;

    private ArrayList<TopicComment> comments;

    private Integer likesCount;

    private Integer commentsCount;

    private Integer postsCount;

    private String createdAt;

    private String updatedAt;

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content The content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * @param author The author
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     * @return The cover
     */
    public String getCover() {
        return cover;
    }

    /**
     * @param cover The cover
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * @return The color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color The color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return The photos
     */
    public ArrayList<String> getPhotos() {
        return photos;
    }

    /**
     * @param photos The photos
     */
    public void setPhotos(ArrayList<String> photos) {
        this.photos = photos;
    }

    /**
     * @return The items
     */
    public ArrayList<Item> getItems() {
        return items;
    }

    /**
     * @param items The items
     */
    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    /**
     * @return The albums
     */
    public ArrayList<Album> getAlbums() {
        return albums;
    }

    /**
     * @param albums The albums
     */
    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

    /**
     * @return The comments
     */
    public ArrayList<TopicComment> getComments() {
        return comments;
    }

    /**
     * @param comments The comments
     */
    public void setComments(ArrayList<TopicComment> comments) {
        this.comments = comments;
    }

    /**
     * @return The likeCount
     */
    public Integer getLikesCount() {
        return likesCount;
    }

    /**
     * @param likesCount The likeCount
     */
    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }

    /**
     * @return The commentsCount
     */
    public Integer getCommentsCount() {
        return commentsCount;
    }

    /**
     * @param commentsCount The commentsCount
     */
    public void setCommentsCount(Integer commentsCount) {
        this.commentsCount = commentsCount;
    }

    /**
     * @return The postsCount
     */
    public Integer getPostsCount() {
        return postsCount;
    }

    /**
     * @param postsCount The postsCount
     */
    public void setPostsCount(Integer postsCount) {
        this.postsCount = postsCount;
    }

    /**
     * @return The createAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt The createAt
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return The updateAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt The updateAt
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Topic(){}

    public Topic(String content)
    {
        this.content=content;
    }
}
