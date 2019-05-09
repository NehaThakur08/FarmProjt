package com.neha.farmingproject.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.neha.farmingproject.R;

public class LogoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
        Intent intent = new Intent(LogoutActivity.this, RegistrationActivity.class);
        startActivity(intent);
        finish();
    }
}