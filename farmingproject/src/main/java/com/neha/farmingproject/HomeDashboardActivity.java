package com.neha.farmingproject;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.neha.farmingproject.ui.AllBuyersActivity;
import com.neha.farmingproject.ui.AllSellersActivity;
import com.neha.farmingproject.ui.CropActivity;
import com.neha.farmingproject.ui.ExpertsActivity;
import com.neha.farmingproject.ui.LogoutActivity;
import com.neha.farmingproject.ui.MyFragmentsActivity;
import com.neha.farmingproject.ui.ProfileActivity;
import com.neha.farmingproject.ui.RegistrationActivity;
import com.neha.farmingproject.ui.otpActivity;


public class HomeDashboardActivity extends AppCompatActivity {
     DrawerLayout drawerLayout;
     ActionBarDrawerToggle toggle;
    ImageView cropimage, weatherimage, expertimage, buyimage,sellimage, videoimage;
    TextView txtcrop,txtweather, txtexpert, txtbuy, txtsell, txtvideo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dashboard);
        drawerLayout = findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        cropimage = findViewById(R.id.crops);
        cropimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CropActivity.class);
                startActivity(intent);
            }
        });


        weatherimage = findViewById(R.id.weather);
        weatherimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegistrationActivity.class);
                startActivity(intent);
            }
        });
        expertimage = findViewById(R.id.expert);
        expertimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExpertsActivity.class);
                startActivity(intent);
            }
        });
        buyimage = findViewById(R.id.buy);
        buyimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AllBuyersActivity.class);
                startActivity(intent);
            }
        });

        videoimage = findViewById(R.id.video);
        videoimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MyFragmentsActivity.class);
                startActivity(intent);
            }
        });

        sellimage = findViewById(R.id.seller);
        sellimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AllSellersActivity.class);
                startActivity(intent);
            }
        });

        txtcrop = findViewById(R.id.crop);
       txtcrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CropActivity.class);
                startActivity(intent);
            }
        });


        txtweather = findViewById(R.id.weathers);
        txtweather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegistrationActivity.class);
                startActivity(intent);
            }
        });
        txtexpert = findViewById(R.id.experts);
        txtexpert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ExpertsActivity.class);
                startActivity(intent);
            }
        });
        txtbuy = findViewById(R.id.buyer);
        txtbuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AllBuyersActivity.class);
                startActivity(intent);
            }
        });

        txtvideo = findViewById(R.id.videos);
        txtvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MyFragmentsActivity.class);
                startActivity(intent);
            }
        });

        txtsell = findViewById(R.id.sellers);
        txtsell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AllSellersActivity.class);
                startActivity(intent);
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}


