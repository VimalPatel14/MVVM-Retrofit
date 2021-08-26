package com.vimal.retrofitmvvm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Category {
//    @SerializedName("Templets")
//    @Expose
//    private List<Object> templets = null;
    @SerializedName("ID")
    @Expose
    private Integer id;
    @SerializedName("CategoryName")
    @Expose
    private String categoryName;
    @SerializedName("Priority")
    @Expose
    private Integer priority;
    @SerializedName("Status")
    @Expose
    private Integer status;
    @SerializedName("LanguageCode")
    @Expose
    private Integer languageCode;
    @SerializedName("CategoryImagePath")
    @Expose
    private String categoryImagePath;
    @SerializedName("Type")
    @Expose
    private String type;


    public Category( Integer id, String categoryName, Integer priority, Integer status, Integer languageCode, String categoryImagePath, String type) {
        super();
        this.id = id;
        this.categoryName = categoryName;
        this.priority = priority;
        this.status = status;
        this.languageCode = languageCode;
        this.categoryImagePath = categoryImagePath;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(Integer languageCode) {
        this.languageCode = languageCode;
    }

    public String getCategoryImagePath() {
        return categoryImagePath;
    }

    public void setCategoryImagePath(String categoryImagePath) {
        this.categoryImagePath = categoryImagePath;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}