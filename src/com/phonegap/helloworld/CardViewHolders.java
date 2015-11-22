package com.phonegap.helloworld;

import android.app.Dialog;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by asymkowick on 11/21/15.
 */
public class CardViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView productTitle;
    public ImageView productPhoto;

    public CardViewHolders(View v) {
        super(v);
        v.setOnClickListener(this);
        productTitle = (TextView) v.findViewById(R.id.product_title);


        //if(photo is horizontal, change the layout file size to product_photo_horizontal)
        productPhoto = (ImageView) v.findViewById(R.id.product_photo);
    }

    @Override
    public void onClick(View v) {
        //Dialog testDialog = new Dialog();
        Toast.makeText(v.getContext(), "Clicked Position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }

}
