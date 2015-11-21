package com.phonegap.helloworld;

import android.media.Image;

/**
 * Created by asymkowick on 11/21/15.
 */
public class ProductCard {
    String name;
    String description;
    Image photo;

    public ProductCard(String nm, String desc) {
        this.name = nm;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Image getPhoto() {
        return photo;
    }

    public void setName(String nm) {
        this.name = nm;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
