package com.phonegap.helloworld;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.Window;

import java.util.ArrayList;
import java.util.List;

public class CategoriesActivity extends Activity implements View.OnClickListener {

    private StaggeredGridLayoutManager staggeredCards;
    private List<ProductCard> getListItemData(){
        List<ProductCard> listViewItems = new ArrayList<ProductCard>();
        listViewItems.add(new ProductCard("name1", R.drawable.one));
        listViewItems.add(new ProductCard("name2", R.drawable.two));
        listViewItems.add(new ProductCard("name3", R.drawable.three));
        listViewItems.add(new ProductCard("name4", R.drawable.four));
        listViewItems.add(new ProductCard("name5", R.drawable.five));
        listViewItems.add(new ProductCard("name6", R.drawable.six));
        listViewItems.add(new ProductCard("name7", R.drawable.seven));
        listViewItems.add(new ProductCard("name8", R.drawable.eight));
        listViewItems.add(new ProductCard("name9", R.drawable.nine));
        listViewItems.add(new ProductCard("name10", R.drawable.ten));
        return listViewItems;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_categories);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        staggeredCards = new StaggeredGridLayoutManager(2, 1);
        recyclerView.setLayoutManager(staggeredCards);

        List<ProductCard> staggeredList = getListItemData();

        CardsRecyclerViewAdapter rcAdapter = new CardsRecyclerViewAdapter(this, staggeredList);
        recyclerView.setAdapter(rcAdapter);


    }

    @Override
    public void onClick(View v) {

    }
}
