package com.phonegap.helloworld;

import java.util.ArrayList;

/**
 * Created by asymkowick on 11/21/15.
 */
public class CategoryCard {
    String category;
    int defaultPhoto;

    public CategoryCard(String name, int defaultPhoto)
    {
        this.category = name;
        this.defaultPhoto = defaultPhoto;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getDefaultPhoto() {
        return defaultPhoto;
    }

    public void setDefaultPhoto(int defaultPhoto) {
        this.defaultPhoto = defaultPhoto;
    }
}
