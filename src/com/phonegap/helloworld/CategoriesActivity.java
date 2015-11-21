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
        listViewItems.add(new ProductCard("name1", "description1"));
        listViewItems.add(new ProductCard("name2", "description2"));
        listViewItems.add(new ProductCard("name3", "description3"));
        listViewItems.add(new ProductCard("name4", "description4"));
        listViewItems.add(new ProductCard("name5", "description5"));
        listViewItems.add(new ProductCard("name6", "description6"));
        listViewItems.add(new ProductCard("name7", "description7"));
        listViewItems.add(new ProductCard("name8", "description8"));
        listViewItems.add(new ProductCard("name9", "description9"));
        listViewItems.add(new ProductCard("name10", "description10"));
        listViewItems.add(new ProductCard("name11", "description11"));
        listViewItems.add(new ProductCard("name12", "description12"));
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
