package com.neha.farmingproject.ui;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.location.LocationManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.neha.farmingproject.R;

import static android.graphics.Color.parseColor;

public class MainActivity extends AppCompatActivity {
    ActionBar actionBar;
//    LocationManager locationManager;
//    double lat,lng;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // getLocation();
        android.support.v7.app.ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(parseColor("#0d1f51")));
        if (savedInstanceState == null) {
            MainFragment mainFragment = new MainFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frame_container, mainFragment).commit();
        }
        actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#008577")));
    }

//    private void getLocation(){
//        locationManager = (LocationManager)getSystemService(getApplicationContext().LOCATION_SERVICE);
    }

