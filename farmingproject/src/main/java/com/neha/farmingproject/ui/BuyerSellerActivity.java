package com.neha.farmingproject.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.neha.farmingproject.HomeDashboardActivity;
import com.neha.farmingproject.R;

public class BuyerSellerActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView listView;
    ArrayAdapter<String> adapter;

    void initViews(){

        getSupportActionBar().setTitle("Buyer");

        listView = findViewById(R.id.listView);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        adapter.add("AAJ TAK"); // 0
        adapter.add("NDTV");    // 1
        adapter.add("CNN IBN"); // 2
        adapter.add("PTC");     // 3
        adapter.add("ZEE NEWS");// 4
        adapter.add("STAR NEWS");//5

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer_seller);
        initViews();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String newsName = adapter.getItem(position);
        Toast.makeText(this,"You Selected "+newsName,Toast.LENGTH_LONG).show();

        Intent intent = new Intent(BuyerSellerActivity.this, HomeDashboardActivity.class);
        startActivity(intent);
    }
    }

