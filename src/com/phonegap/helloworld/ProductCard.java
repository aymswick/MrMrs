package com.phonegap.helloworld;

import android.media.Image;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by asymkowick on 11/21/15.
 */
public class ProductCard implements Parcelable {
    String name;
    String description;
    int horizontal;
    int photo;

    public ProductCard(String nm, int photo) {
        this.name = nm;
        this.photo = photo;
        this.horizontal = 0;
    }

    public ProductCard(String nm, int photo, int horiz) {
        this.name = nm;
        this.photo = photo;
        this.horizontal = horiz;
    }

    public ProductCard(Parcel in) {
        name = in.readString();
        horizontal = in.readInt();
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

    public int isHorizontal() {
        return horizontal;
    }

    public void setName(String nm) {
        this.name = nm;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setOrientation(int horiz) {
        this.horizontal = horiz;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeValue(horizontal);
    }


    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public ProductCard createFromParcel(Parcel in) {
            return new ProductCard(in);
        }

        public ProductCard[] newArray(int size) {
            return new ProductCard[size];
        }
    };



}
