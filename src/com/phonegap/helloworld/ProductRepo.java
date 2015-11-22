package com.phonegap.helloworld;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by asymkowick on 11/22/15.
 *
 * This class will be used to contain all of the Product information.
 * Since the client did not have a database already implemented, we will
 * provide SQLite as an example with only a small amount of client data.
 *
 * In the future, an online database should manage all images and most other
 * metadata.
 *
 */


public class ProductRepo {

    private DBHelper dbHelper;

    public ProductRepo(Context context) {
        dbHelper = new DBHelper(context);
    }

    public int insert(Product product) {
        //Open connection
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Product.KEY_name, product.name);
        values.put(Product.KEY_shop, product.shopSimilar);
        values.put(Product.KEY_optional, product.optionalInfo);
        values.put(Product.KEY_photo, product.photo);

        //Insert rows
        long product_Id = db.insert(Product.TABLE, null, values);
        db.close();
        return (int) product_Id;
    }

    public void delete(int product_Id) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        // It's a good practice to use parameter ?, instead of concatenate string
        db.delete(Product.TABLE, Product.KEY_ID + "= ?", new String[] { String.valueOf(product_Id) });
        db.close(); // Closing database connection
    }

    public void update(Product product) {

        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(Product.KEY_name, product.name);
        values.put(Product.KEY_shop, product.shopSimilar);
        values.put(Product.KEY_optional, product.optionalInfo);
        values.put(Product.KEY_photo, product.photo);

        // It's a good practice to use parameter ?, instead of concatenate string
        db.update(Product.TABLE, values, Product.KEY_ID + "= ?", new String[]{String.valueOf(product.product_ID)});
        db.close(); // Closing database connection
    }


    //The actual data is stored as a list of KeyVal pairs (in a hashmap)
    public ArrayList<HashMap<String, String>> getProductList() {
        //Open connection to read only
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String selectQuery =  "SELECT  " +
                Product.KEY_ID + "," +
                Product.KEY_name + "," +
                Product.KEY_shop + "," +
                Product.KEY_optional + "," +
                Product.KEY_photo + "," +
                " FROM " + Product.TABLE;

        //Product product = new Product();
        ArrayList<HashMap<String, String>> productList = new ArrayList<HashMap<String, String>>();

        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {
            do {
                HashMap<String, String> product = new HashMap<String, String>();
                product.put("id", cursor.getString(cursor.getColumnIndex(Product.KEY_ID)));
                product.put("name", cursor.getString(cursor.getColumnIndex(Product.KEY_name)));
                productList.add(product);

            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();
        return productList;

    }

    public Product getProductById(int id) {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String selectQuery =  "SELECT  " +
                Product.KEY_ID + "," +
                Product.KEY_name + "," +
                Product.KEY_shop + "," +
                Product.KEY_optional + "," +
                Product.KEY_photo +
                " FROM " + Product.TABLE
                + " WHERE " +
                Product.KEY_ID + "=?";// It's a good practice to use parameter ?, instead of concatenate string

        int iCount =0;
        Product product = new Product();

        Cursor cursor = db.rawQuery(selectQuery, new String[] { String.valueOf(id) } );

        if (cursor.moveToFirst()) {
            do {
                product.product_ID =cursor.getInt(cursor.getColumnIndex(Product.KEY_ID));
                product.name =cursor.getString(cursor.getColumnIndex(Product.KEY_name));
                product.shopSimilar =cursor.getString(cursor.getColumnIndex(Product.KEY_shop));
                product.optionalInfo =cursor.getString(cursor.getColumnIndex(Product.KEY_optional));
                product.photo  =cursor.getString(cursor.getColumnIndex(Product.KEY_photo));

            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();
        return product;
    }







}
