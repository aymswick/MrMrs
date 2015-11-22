package com.phonegap.helloworld;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by asymkowick on 11/21/15.
 */
public class CategoryCardsRecyclerViewAdapter extends RecyclerView.Adapter<CardViewHolders>{

    private List<CategoryCard> catList;
    private Context context;

    public CategoryCardsRecyclerViewAdapter(Context context, List<CategoryCard> catList) {
        this.catList = catList;
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
        holder.categoryTitle.setText(catList.get(position).getCategory());
        holder.categoryPhoto.setImageResource(catList.get(position).getDefaultPhoto());
    }

    @Override
    public int getItemCount() {
        return this.catList.size();
    }
}
