package com.neha.farmingproject.ui;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;

import com.neha.farmingproject.R;
import com.neha.farmingproject.model.Buyers;
import java.util.ArrayList;

public class AllBuyersActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    RecyclerView recyclerView;

    ArrayList<Buyers> buyersList;
    BuyersAdapter buyersAdapter;
    BuyersRecyclerAdapter recyclerAdapter;

    void initViews() {
        //listView = findViewById(R.id.listView);
        recyclerView = findViewById(R.id.recyclerView);

        buyersList = new ArrayList<>();

        Buyers buyers1 = new Buyers(R.drawable.mustard, "Mustard", "Karmvir Singh Rana", "Quantity : 100 Tonnes(s)","Grade : Hy-ola PAC 401","Contact : 9878255482", "Price : ₹ 42 Per Quintal");
        Buyers buyers2 = new Buyers(R.drawable.ginger1, "Ginger", "Brahm", "Quantity : 500 Tonnes(s)","Grade : Abc","Contact : 9805310006", "Price : ₹ 250 Per Kilogram");
        Buyers buyers3 = new Buyers(R.drawable.potato1, "Potato", "Harinder Singh Gill", "Quantity : 800 Tonnes(s)","Grade : good","Contact : 9770200100", "Price : ₹ 600 Per Quintal");
        Buyers buyers4 = new Buyers(R.drawable.potato1, "Potato", "Harinder Singh Gill", "Quantity : 700 Tonnes(s)","Grade : good1","Contact : 9781300100", "Price : ₹ 900 Per Quintal");
        Buyers buyers5 = new Buyers(R.drawable.asparagus, "Asparagus", "Raj", "Quantity : 100 Tonnes(s)","Grade : Abc","Contact : 9990951167", "Price : ₹ 20 Per Kilogram");
        Buyers buyers6 = new Buyers(R.drawable.aonla, "Aonla", "Manoj Singh Rawal", "Quantity : 50 Tonnes(s)","Grade : B","Contact : 9990951167", "Price : ₹ 15 Per Kilogram");
        Buyers buyers7 = new Buyers(R.drawable.wheat, "Wheat", "Manpreet Singh", "Quantity : 250 Tonnes(s)","Grade : a","Contact : 6284833282", "Price : ₹ 2100 Per Quintal");
        Buyers buyers8 = new Buyers(R.drawable.wheat, "Wheat", "Gurkirat Singh", "Quantity : 15 Tonnes(s)","Grade : 3086 a","Contact : 7837661113", "Price : ₹ 15 Per Quintal");
        Buyers buyers9 = new Buyers(R.drawable.sugarcane1, "Sugarcane", "Kulveer Singh", "Quantity : 1 Tonnes(s)","Grade :a","Contact : 9870071579", "Price : ₹ 4000 Per Quintal");
        Buyers buyers10 = new Buyers(R.drawable.kinnow, "Kinnow", "Karan Sihag", "Quantity : 1500 Tonnes(s)","Grade : First","Contact : 9430808043", "Price : ₹ 1200 Per Quintal");



        buyersList.add(buyers1); //0
        buyersList.add(buyers2);
        buyersList.add(buyers3);
        buyersList.add(buyers4);
        buyersList.add(buyers5); //4
        buyersList.add(buyers6);
        buyersList.add(buyers7);
        buyersList.add(buyers8);
        buyersList.add(buyers9);
        buyersList.add(buyers10);

        //newsList.add(new News(R.drawable.category,"NDTV","https://ndtv.india.com"));

        //newsAdapter = new NewsAdapter(this, R.layout.list_item, newsList);
        //listView.setAdapter(newsAdapter);

        //listView.setOnItemClickListener(this);

        recyclerAdapter = new BuyersRecyclerAdapter(this, R.layout.list_buyer, buyersList);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
//        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.setAdapter(recyclerAdapter);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_sellers);
        initViews();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Buyers buyers = buyersList.get(position);
        Intent intent = new Intent(AllBuyersActivity.this, WebViewBuyersActivity.class);
        intent.putExtra("keyBuyers", buyers);
        startActivity(intent);

    }
}