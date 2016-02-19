package com.ihappy.pj_mvp.bean;

public class Part {

    //ITEM、TEXT、VIDEO、TAG、MENTION、ALBUM
    public static final String TYPE_ITEM = "ITEM";
    public static final String TYPE_TEXT = "TEXT";
    public static final String TYPE_VIDEO = "VIDEO";
    public static final String TYPE_TAG = "TAG";
    public static final String TYPE_MENTION = "MENTION";
    public static final String TYPE_ALBUM = "ALBUM";

    private Integer id;

    private String type;

    private String target;

    private String title;

    private Double x;

    private Double y;

    private String snapshot;

    public Integer getId() {
        return id;
    }

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
     * @return The target
     */
    public String getTarget() {
        return target;
    }

    /**
     * @param target The target
     */
    public void setTarget(String target) {
        this.target = target;
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
     * @return The x
     */
    public Double getX() {
        return x;
    }

    /**
     * @param x The x
     */
    public void setX(Double x) {
        this.x = x;
    }

    /**
     * @return The y
     */
    public Double getY() {
        return y;
    }

    /**
     * @param y The y
     */
    public void setY(Double y) {
        this.y = y;
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

}