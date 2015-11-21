package com.phonegap.helloworld;

/**
 * Created by asymkowick on 11/21/15.
 */
public class Category {
    String name;
    int categoryDefaultPhoto;

    public Category() {

    }

    public int getCategoryDefaultPhoto() {
        return categoryDefaultPhoto;
    }

    public void setCategoryDefaultPhoto(int categoryDefaultPhoto) {
        this.categoryDefaultPhoto = categoryDefaultPhoto;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }
}
