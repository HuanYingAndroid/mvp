package com.ihappy.pj_mvp.bean;

import se.emilsjolander.sprinkles.Model;
import se.emilsjolander.sprinkles.annotations.Key;

/**
 * Created by yanchangsen on 15/4/12.
 */
public class Brand extends Model {

    @Key
    @se.emilsjolander.sprinkles.annotations.Column("id")
    private Integer id;

    @se.emilsjolander.sprinkles.annotations.Column("title")
    private String title;

    @se.emilsjolander.sprinkles.annotations.Column("description")
    private String description;

    @se.emilsjolander.sprinkles.annotations.Column("logo")
    private String logo;

    @se.emilsjolander.sprinkles.annotations.Column("letter")
    private String letter;

    @se.emilsjolander.sprinkles.annotations.Column("category")
    private Category category;

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
     * @return The logo
     */
    public String getLogo() {
        return logo;
    }

    /**
     * @param logo The logo
     */
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * @return The letter
     */
    public String getLetter() {
        return letter;
    }

    /**
     * @param letter The letter
     */
    public void setLetter(String letter) {
        this.letter = letter;
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