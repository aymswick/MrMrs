package com.phonegap.helloworld;

/**
 * Created by asymkowick on 11/22/15.
 */
public class Product {
    public static final String TABLE = "Product";

    public static final String KEY_ID = "id";
    public static final String KEY_name = "name";
    public static final String KEY_shop = "shop";
    public static final String KEY_optional = "optional";
    public static final String KEY_photo = "photo";

    public String name;
    public String shopSimilar; //Example "Shop similar at Macy's"
    public String optionalInfo; //Some items have this
    public String photo;
    public String link;
    public int product_ID;

    public Product() {

    }

    public Product(String name, String shopSimilar, String optional, String photo, String link) {
        this.name = name;
        this.shopSimilar = shopSimilar;
        this.optionalInfo = optional;
        this.photo = photo;
        this.link = link;

    }

}
