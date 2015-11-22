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
        listViewItems.get(0).addCategory("Bride");
        listViewItems.get(0).addCategory("Groom");
        listViewItems.get(0).addCategory("Bridesmaids");
        listViewItems.get(0).addCategory("Everything");
        listViewItems.add(new ProductCard("Wedding Dress", R.drawable.two));
        listViewItems.get(1).addCategory("Check-in");
        listViewItems.get(1).addCategory("Everything");
        listViewItems.add(new ProductCard("Chairs", R.drawable.three, 1));
        listViewItems.get(2).addCategory("Bride");
        listViewItems.get(2).addCategory("Ceremony");
        listViewItems.get(2).addCategory("Everything");
        listViewItems.add(new ProductCard("Surprised", R.drawable.four));
        listViewItems.get(3).addCategory("Favors");
        listViewItems.get(3).addCategory("Reception");
        listViewItems.get(3).addCategory("Signage");
        listViewItems.get(3).addCategory("Everything");
        listViewItems.add(new ProductCard("Bouquet", R.drawable.five));
        listViewItems.get(4).addCategory("Favors");
        listViewItems.get(4).addCategory("Everything");
        listViewItems.add(new ProductCard("Sweet", R.drawable.six));
        listViewItems.get(5).addCategory("Signage");
        listViewItems.get(5).addCategory("Reception");
        listViewItems.get(5).addCategory("Everything");
        listViewItems.add(new ProductCard("Standing", R.drawable.seven));
        listViewItems.get(6).addCategory("Accessories");
        listViewItems.get(6).addCategory("Everything");
        listViewItems.add(new ProductCard("Surprised", R.drawable.eight));
        listViewItems.get(7).addCategory("Cake");
        listViewItems.get(7).addCategory("Everything");
        listViewItems.add(new ProductCard("Flowers", R.drawable.nine));
        listViewItems.get(8).addCategory("Reception");
        listViewItems.get(8).addCategory("Everything");
        listViewItems.add(new ProductCard("Cake", R.drawable.ten));
        listViewItems.get(9).addCategory("Bride");
        listViewItems.get(9).addCategory("Bridesmaids");
        listViewItems.get(9).addCategory("Everything");
        listViewItems.add(new ProductCard("New",R.drawable.eleven));
        listViewItems.get(10).addCategory("Groom");
        listViewItems.get(10).addCategory("Everything");
        listViewItems.add(new ProductCard("New1",R.drawable.twelve));
        listViewItems.get(11).addCategory("Lighting");
        listViewItems.get(11).addCategory("Reception");
        listViewItems.get(11).addCategory("Everything");
        listViewItems.add(new ProductCard("New2",R.drawable.thirteen));
        listViewItems.get(12).addCategory("Lighting");
        listViewItems.get(12).addCategory("Reception");
        listViewItems.get(12).addCategory("Everything");

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
        ProductRepo repo = new ProductRepo(this);
        //Product("Name","Similar","Optional","Photo","Link")
        Product one = new Product("Tulle Ball Gown","Shop similar at David's Bridal","","","http://www.davidsbridal.com/Product_melissa-sweet-tulle-wedding-dress-with-3d-flowers-ms251115");
        repo.insert(one);
        Product two = new Product("Letter Box","Shop this item at Beau-Coup","","","http://www.shareasale.com/m-pr.cfm?merchantID=15302&userID=1059707&productID=536203948");
        repo.insert(two);
        Product three = new Product("Floral Robes","Shop similar at Etsy","","","https://www.etsy.com/listing/165630630/set-of-5-floral-kimono-crossover?pid=250899");
        repo.insert(three);
        Product four = new Product("Monopoly Table Numbers","Shop this item at Ashley Loyd","","","http://ashleyloyd.dunked.com/invitations-wedding-suites");
        repo.insert(four);
        Product five = new Product("Burlap Favor Bags","Shop this item at Luna Bazaar","","","http://www.lunabazaar.com/FB18NAT-natural-brown-burlap-favor-bag.aspx?ref=sas");
        repo.insert(five);
        Product six = new Product("Distressed White Windowpane","Shop this item at World Market","","","http://www.worldmarket.com/product/white+vintage+6-photo+frame.do");
        repo.insert(six);
        Product seven = new Product("University of Texas Lace Garter","Shop this item at Etsy","","","https://www.etsy.com/listing/157151037/university-of-texas-longhorns-stretch?pid=250899");
        repo.insert(seven);
        Product eight = new Product("Love Knows No Borders Cake Topper", "Shop this item at Etsy","","","https://www.etsy.com/listing/187289367/texas-california-state-shaped-cake?pid=250899");
        repo.insert(eight);
        Product nine = new Product ("Bud Vases","Shop similar at Luna Bazaar","","","http://www.lunabazaar.com/CG92-6-clear-glass-vintage-bottle-set.aspx?ref=sas");
        repo.insert(nine);
        Product ten = new Product("Flower Dress", "Shop similar at Etsy","","","https://www.etsy.com/listing/165630630/set-of-5-floral-kimono-crossover?pid=250899");
        repo.insert(ten);
        Product eleven = new Product("Purple Check Dress Shirt","Shop Similar at Nordstorm","","","http://shop.nordstrom.com/s/trim-fit-dress-shirt/4110982?cm_ven=Linkshare&cm_cat=partner&cm_pla=10&cm_ite=1&siteId=Ai37Xnk2cUM-35ODqc3ahXLeWjsG1qIlsg");
        repo.insert(eleven);
        Product twelve = new Product("Manzanita Branches","Shop this item at Koyal","","","http://www.koyalwholesale.com/p26868/24-real-manzanita-branches-natural-brown.html");
        repo.insert(twelve);
        Product thirteen = new Product("White Tablecloth","Shop this item at Koyal","","","http://www.koyalwholesale.com/p10256/120-round-table-linens-white.html");
        repo.insert(thirteen);



        Product product = new Product();


        repo.insert(product);
        //you left off trying to insert all that old data into the
        //newly created SQLite Database
        //you gotta build each product item
        //stuff the data into each product
        //then add each product using INSERT

        //Must complete navigation bar fragment, use tutorial
        //already in browser tab

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
