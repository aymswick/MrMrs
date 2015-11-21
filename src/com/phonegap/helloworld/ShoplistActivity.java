package com.phonegap.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class ShoplistActivity extends Activity implements View.OnClickListener {

    private StaggeredGridLayoutManager staggeredCards;

    public List<ProductCard> getListItemData(){

        List<ProductCard> listViewItems = new ArrayList<ProductCard>();
        listViewItems.add(new ProductCard("Makeup", R.drawable.one));
        listViewItems.add(new ProductCard("Wedding Dress", R.drawable.two));
        listViewItems.add(new ProductCard("Chairs", R.drawable.three, 1));
        listViewItems.add(new ProductCard("Surprised", R.drawable.four));
        listViewItems.add(new ProductCard("Bouquet", R.drawable.five));
        listViewItems.add(new ProductCard("Sweet", R.drawable.six));
        listViewItems.add(new ProductCard("Standing", R.drawable.seven));
        listViewItems.add(new ProductCard("Surprised", R.drawable.eight));
        listViewItems.add(new ProductCard("Flowers", R.drawable.nine));
        listViewItems.add(new ProductCard("Cake", R.drawable.ten));

        int [] vals = new int[listViewItems.size()];
        for(int i = 0; i < listViewItems.size(); i++)
        {
            vals[i] = listViewItems.get(i).isHorizontal();
        }

        Intent i = new Intent(this, CardViewHolders.class);
        i.putExtra("horizontals", vals);
        return listViewItems;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_shoplist);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        staggeredCards = new StaggeredGridLayoutManager(1, 1);
        recyclerView.setLayoutManager(staggeredCards);

        List<ProductCard> staggeredList = getListItemData();

        CardsRecyclerViewAdapter rcAdapter = new CardsRecyclerViewAdapter(this, staggeredList);
        recyclerView.setAdapter(rcAdapter);


    }

    @Override
    public void onClick(View v) {

    }
}
