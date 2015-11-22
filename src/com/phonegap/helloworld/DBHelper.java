package com.phonegap.helloworld;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by asymkowick on 11/22/15.
 */
public class DBHelper extends SQLiteOpenHelper {

    //Keep track of versions
    private static final int DATABASE_VERSION = 1;

    //Name
    private static final String DATABASE_NAME = "crud.db";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Creating tables here
        String CREATE_TABLE_PRODUCT = "CREATE TABLE " + Product.TABLE
                + "(" + Product.KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT ,"
                + Product.KEY_name + " TEXT, "
                + Product.KEY_shop + " TEXT, "
                + Product.KEY_optional + " TEXT, "
                + Product.KEY_photo + " TEXT )";

        db.execSQL(CREATE_TABLE_PRODUCT);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if exists and recreate
        db.execSQL("DROP TABLE IF EXISTS " + Product.TABLE);
        onCreate(db);
    }
}
