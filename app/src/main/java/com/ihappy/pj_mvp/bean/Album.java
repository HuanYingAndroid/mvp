package com.ihappy.pj_mvp.bean;
import java.util.ArrayList;
import se.emilsjolander.sprinkles.Model;
import se.emilsjolander.sprinkles.annotations.Key;

public class Album extends Model {

    @Key
    @se.emilsjolander.sprinkles.annotations.Column("id")
    private Integer id;

    @se.emilsjolander.sprinkles.annotations.Column("title")
    private String title;

    @se.emilsjolander.sprinkles.annotations.Column("subtitle")
    private String subtitle;

    @se.emilsjolander.sprinkles.annotations.Column("headline")
    private String headline;

    @se.emilsjolander.sprinkles.annotations.Column("category")
    private Category category;

    @se.emilsjolander.sprinkles.annotations.Column("description")
    private String description;

    @se.emilsjolander.sprinkles.annotations.Column("style")
    private String style;

    @se.emilsjolander.sprinkles.annotations.Column("cover")
    private String cover;

    @se.emilsjolander.sprinkles.annotations.Column("color")
    private String color;

    @se.emilsjolander.sprinkles.annotations.Column("viewsCount")
    private Integer viewsCount;

    @se.emilsjolander.sprinkles.annotations.Column("likesCount")
    private Integer likesCount;

    @se.emilsjolander.sprinkles.annotations.Column("commentsCount")
    private Integer commentsCount;

    @se.emilsjolander.sprinkles.annotations.Column("pagesCount")
    private Integer pagesCount;

    @se.emilsjolander.sprinkles.annotations.Column("author")
    private Author author;

    @se.emilsjolander.sprinkles.annotations.Column("pages")
    private ArrayList<Page> pages = new ArrayList<Page>();

    @se.emilsjolander.sprinkles.annotations.Column("created_at")
    private String createdAt;

    @se.emilsjolander.sprinkles.annotations.Column("updated_at")
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
     * @return The subtitle
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * @param subtitle The subtitle
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    /**
     * @return The headline
     */
    public String getHeadline() {
        return headline;
    }

    /**
     * @param headline The headline
     */
    public void setHeadline(String headline) {
        this.headline = headline;
    }

    /**
     * @return The category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category The category
     */
    public void setCategory(Category category) {
        this.category = category;
    }

//    /**
//     * @return The column
//     */
//    public Column getColumn() {
//        return column;
//    }
//
//    /**
//     * @param column The column
//     */
//    public void setColumn(Column column) {
//        this.column = column;
//    }

    /**
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The style
     */
    public String getStyle() {
        return style;
    }

    /**
     * @param style The style
     */
    public void setStyle(String style) {
        this.style = style;
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
     * @return The likesCount
     */
    public Integer getLikesCount() {
        return likesCount;
    }

    /**
     * @param likesCount The likesCount
     */
    public void setLikesCount(Integer likesCount) {
        this.likesCount = likesCount;
    }

    /**
     * @return The viewsCount
     */
    public Integer getViewsCount() {
        return viewsCount;
    }

    /**
     * @param viewsCount The viewsCount
     */
    public void setViewsCount(Integer viewsCount) {
        this.viewsCount = viewsCount;
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
     * @return The pagesCount
     */
    public Integer getPagesCount() {
        return pagesCount;
    }

    /**
     * @param pagesCount The pagesCount
     */
    public void setPagesCount(Integer pagesCount) {
        this.pagesCount = pagesCount;
    }

    /**
     * @return The author
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
     * @return The pages
     */
    public ArrayList<Page> getPages() {
        return pages;
    }

    /**
     * @param pages The pages
     */
    public void setPages(ArrayList<Page> pages) {
        this.pages = pages;
    }

    /**
     * @return The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt The createdAt
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @param updatedAt The updatedAt
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}