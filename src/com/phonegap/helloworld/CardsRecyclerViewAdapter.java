package com.phonegap.helloworld;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by asymkowick on 11/21/15.
 */
public class CardsRecyclerViewAdapter extends RecyclerView.Adapter<CardViewHolders> {

    private List<ProductCard> itemList;

    private Context context;

    public CardsRecyclerViewAdapter(Context context, List<ProductCard> itemList) {
        this.itemList = itemList;
        this.context = context;

    }

    @Override
    public CardViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.cards_lists, null);
        CardViewHolders rcv = new CardViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(CardViewHolders holder, int position) {
        holder.productTitle.setText(itemList.get(position).getName());
        holder.productPhoto.setImageResource(itemList.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
