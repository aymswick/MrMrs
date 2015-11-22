package com.phonegap.helloworld;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CategoriesActivity extends Activity implements View.OnClickListener{

    private StaggeredGridLayoutManager staggeredCards;


    public ArrayList<CategoryCard> getListItemData() {
        ArrayList<CategoryCard> categories = new ArrayList<CategoryCard>(12);

        categories.add(new CategoryCard("Bride", R.drawable.bride));
        categories.add(new CategoryCard("Ceremony", R.drawable.ceremony));
        categories.add(new CategoryCard("Groom", R.drawable.groom));
        categories.add(new CategoryCard("Bridesmaids", R.drawable.bridesmaids));
        categories.add(new CategoryCard("Accessories", R.drawable.accessories));
        categories.add(new CategoryCard("Check-in", R.drawable.checkin));
        categories.add(new CategoryCard("Favors", R.drawable.favors));
        categories.add(new CategoryCard("Lighting", R.drawable.lighting));
        categories.add(new CategoryCard("Cake",R.drawable.cake));
        categories.add(new CategoryCard("Stationery", R.drawable.signage));
        categories.add(new CategoryCard("Reception",R.drawable.reception));
        categories.add(new CategoryCard("Everything", R.drawable.everything));

        return categories;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view2);
        recyclerView.setHasFixedSize(true);

        staggeredCards = new StaggeredGridLayoutManager(2, 1);
        recyclerView.setLayoutManager(staggeredCards);

        ArrayList<CategoryCard> staggeredList = getListItemData();

        CategoryCardsRecyclerViewAdapter rcAdapter = new CategoryCardsRecyclerViewAdapter(this, staggeredList);
        recyclerView.setAdapter(rcAdapter);
    }

    @Override
    public void onClick(View v) {
        //if(v.getId() == R.id)
    }
}
