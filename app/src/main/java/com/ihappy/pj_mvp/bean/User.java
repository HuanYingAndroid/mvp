package com.ihappy.pj_mvp.bean;

/**
 * Created by liuhuan-mac on 16/1/29.
 */
public class User {
    private int id;
    private String name;
    private String description;

    public User(){}

    public User(int id,String name,String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public User(String name,String description){
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
