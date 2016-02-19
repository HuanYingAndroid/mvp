package com.ihappy.pj_mvp.bean;


import java.util.ArrayList;
import java.util.List;

import se.emilsjolander.sprinkles.Model;
import se.emilsjolander.sprinkles.annotations.Key;
public class Item extends Model {

    @Key
    @se.emilsjolander.sprinkles.annotations.Column("id")
    private Integer id;

    @se.emilsjolander.sprinkles.annotations.Column("name")
    private String name;

    @se.emilsjolander.sprinkles.annotations.Column("link")
    private String link;

    @se.emilsjolander.sprinkles.annotations.Column("description")
    private String description;

    @se.emilsjolander.sprinkles.annotations.Column("price")
    private String price;

    @se.emilsjolander.sprinkles.annotations.Column("brand")
    private Brand brand;

    @se.emilsjolander.sprinkles.annotations.Column("reviewsCount")
    private Integer reviewsCount;

    @se.emilsjolander.sprinkles.annotations.Column("createdAt")
    private String createdAt;

    @se.emilsjolander.sprinkles.annotations.Column("updatedAt")
    private String updatedAt;

    @se.emilsjolander.sprinkles.annotations.Column("photos")
    private ArrayList<String> photos = new ArrayList<String>();

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
     * @return The link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link The link
     */
    public void setLink(String link) {
        this.link = link;
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
     * @return The price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price The price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return The photos
     */
    public List<String> getPhotos() {
        return photos;
    }

    /**
     * @param photos The photos
     */
    public void setPhotos(ArrayList<String> photos) {
        this.photos = photos;
    }

    /**
     * @return The brand
     */
    public Brand getBrand() {
        return brand;
    }

    /**
     * @param brand The brand
     */
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    /**
     * @return The reviewsCount
     */
    public Integer getReviewsCount() {
        return reviewsCount;
    }

    /**
     * @param reviewsCount The reviewsCount
     */
    public void setReviewsCount(Integer reviewsCount) {
        this.reviewsCount = reviewsCount;
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