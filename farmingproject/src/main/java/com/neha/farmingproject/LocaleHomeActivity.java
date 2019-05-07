package com.neha.farmingproject;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.neha.farmingproject.ui.CropActivity;
import com.neha.farmingproject.ui.RegistrationActivity;

public class LocaleHomeActivity extends AppCompatActivity {
    TextView txt1, txt2, txt3, txt4, txt5;
        private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    ImageView cropimage, weatherimage, expertimage, buyimage, videoimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locale_home);
        txt1 = findViewById(R.id.crop);
        txt2 = findViewById(R.id.wea);
        txt3 = findViewById(R.id.sell);
        txt4 = findViewById(R.id.exp);
        txt5 = findViewById(R.id.vid);

        txt1.setText(getResources().getString(R.string.namecrop));
        txt2.setText(getResources().getString(R.string.nameweather));
        txt3.setText(getResources().getString(R.string.namebuy));
        txt4.setText(getResources().getString(R.string.namevideo));
        txt5.setText(getResources().getString(R.string.nameexpert));
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
                Intent intent = new Intent(getApplicationContext(), CropActivity.class);
                startActivity(intent);
            }
        });
        buyimage = findViewById(R.id.buy);
        buyimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegistrationActivity.class);
                startActivity(intent);
            }
        });
        videoimage = findViewById(R.id.video);
        videoimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegistrationActivity.class);
                startActivity(intent);
            }
        });
    }


    //    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
//            new BottomNavigationView.OnNavigationItemSelectedListener() {
//                @Override
//                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//                    switch (menuItem.getItemId()) {
//                        case R.id.navigation_home:
//                            Intent intent = new Intent(HomeDashboardActivity.this, RegistrationActivity.class);
//                            startActivity(intent);
//                            break;
//                        case R.id.se:
//                            Intent intent1 = new Intent(HomeDashboardActivity.this, CropActivity.class);
//                            startActivity(intent1);
//                            break;
//
//
//                    }
//                    return false;
//                }
//
//            };
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}


