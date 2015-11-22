package com.phonegap.helloworld;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.Settings;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by asymkowick on 11/21/15.
 */
public class CardViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView productTitle;
    public TextView categoryTitle;
    public ImageView productPhoto;
    public ImageView categoryPhoto;

    public Dialog productInfoDialog;

    public CardViewHolders(View v) {
        super(v);
        v.setOnClickListener(this);
        productTitle = (TextView) v.findViewById(R.id.product_title);
        categoryTitle = (TextView) v.findViewById(R.id.category_title);

        //if(photo is horizontal, change the layout file size to product_photo_horizontal)
        productPhoto = (ImageView) v.findViewById(R.id.product_photo);
        categoryPhoto = (ImageView) v.findViewById(R.id.category_photo);
    }

    @Override
    public void onClick(final View v) {

        //Connect to the SQLite database
        ProductRepo repo = new ProductRepo(v.getContext());

        //michael work from here, uncomment these lines
        Product product = new Product();
        product = repo.getProductById(0);



        final Dialog dialog = new Dialog(v.getContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.product_info_custom_dialog);
        //dialog.setTitle("Test Title");

        TextView productTitle = (TextView) dialog.findViewById(R.id.productTitle);
        TextView shopSimilar = (TextView) dialog.findViewById(R.id.shopSimilar);
        TextView optionalInfo = (TextView) dialog.findViewById(R.id.optionalInfo);

        //Feed Database info into dialog elements
        productTitle.setText(product.name);
        shopSimilar.setText(product.shopSimilar);
        optionalInfo.setText(product.optionalInfo);
        dialog.show();

        //If the user taps on a Product photo, they should see TAGS pop up in a dialog
        if(v.getId() == productPhoto.getId())
        {

            //All code outside this if should go in it
            //Can't figure out how to determine individual product card taps...everything behaving on
            //a single tap anywhere on the page
        }

        //If the user taps on a Category photo, they shoud be taken to a scrolling feed of only items from that CATEGORY
        else if(v.getId() == R.id.category_photo)
        {
            //tbd
        }




        //AlertDialog alertDialog = alertDialogBuilder.show();
        //Toast.makeText(v.getContext(), "Clicked Position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }



}
