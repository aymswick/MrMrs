package com.phonegap.helloworld;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by asymkowick on 11/21/15.
 */
public class CardViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView countryName;
    public ImageView countryPhoto;

    public CardViewHolders(View v) {
        super(v);
        v.setOnClickListener(this);
        countryName = (TextView) v.findViewById(R.id.country_name);
        countryPhoto = (ImageView) v.findViewById(R.id.country_photo);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), "Clicked Position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }

}
