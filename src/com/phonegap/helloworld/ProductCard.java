package com.phonegap.helloworld;

import android.media.Image;

/**
 * Created by asymkowick on 11/21/15.
 */
public class ProductCard {
    String name;
    String description;
    int photo;

    public ProductCard(String nm, int photo) {
        this.name = nm;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPhoto() {
        return photo;
    }

    public void setName(String nm) {
        this.name = nm;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
