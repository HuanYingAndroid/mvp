package com.ihappy.pj_mvp.bean;

import java.util.ArrayList;
import java.util.List;

public class Page {

    private Integer id;

    private String type;

    private String title;

    private String description ;

    private String duration ;

    private String content;

    private List<Part> parts = new ArrayList<Part>();

    private String snapshot;

    private String photo;

    private String style;

    private String createdAt;

    private String updatedAt;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

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
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(String type) {
        this.type = type;
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
     * @return The parts
     */
    public List<Part> getParts() {
        return parts;
    }

    /**
     * @param parts The parts
     */
    public void setParts(List<Part> parts) {
        this.parts = parts;
    }

    /**
     * @return The snapshot
     */
    public String getSnapshot() {
        return snapshot;
    }

    /**
     * @param snapshot The snapshot
     */
    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
    }

    /**
     * @return The Photo
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * @param Photo The snapshot
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    /**
     * @return The Photo
     */
    public String getStyle() {
        return style;
    }

    /**
     * @param style The snapshot
     */
    public void setStyle(String style) {
        this.style = style;
    }
}