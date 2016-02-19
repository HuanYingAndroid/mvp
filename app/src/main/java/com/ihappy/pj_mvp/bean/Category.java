package com.ihappy.pj_mvp.bean;
import se.emilsjolander.sprinkles.Model;
import se.emilsjolander.sprinkles.annotations.Key;

/**
 * Created by yanchangsen on 15/4/12.
 */
public class Category extends Model {

    @Key
    @se.emilsjolander.sprinkles.annotations.Column("id")
    private Integer id;

    @se.emilsjolander.sprinkles.annotations.Column("name")
    private String name;

    @se.emilsjolander.sprinkles.annotations.Column("title")
    private String title;

    @se.emilsjolander.sprinkles.annotations.Column("description")
    private String description;

    @se.emilsjolander.sprinkles.annotations.Column("color")
    private String color;

    @se.emilsjolander.sprinkles.annotations.Column("albumsCount")
    private Integer albumsCount;

    @se.emilsjolander.sprinkles.annotations.Column("icon")
    private String icon;

    @se.emilsjolander.sprinkles.annotations.Column("background")
    private String background;

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

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
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
     * @return The albumsCount
     */
    public Integer getAlbumsCount() {
        return albumsCount;
    }

    /**
     * @param albumsCount The albumsCount
     */
    public void setAlbumsCount(Integer albumsCount) {
        this.albumsCount = albumsCount;
    }

    /**
     * @return The icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon The icon
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return The background
     */
    public String getBackground() {
        return background;
    }

    /**
     * @param background The background
     */
    public void setBackground(String background) {
        this.background = background;
    }

}
