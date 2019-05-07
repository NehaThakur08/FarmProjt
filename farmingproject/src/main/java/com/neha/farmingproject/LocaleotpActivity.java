package com.neha.farmingproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.neha.farmingproject.ui.otpActivity;

public class LocaleotpActivity extends AppCompatActivity {
    TextView txt;
    Button btnVerify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localeotp);
        txt = findViewById(R.id.textViewEnter);
        // Dynamically how we can set the String
        txt.setText(getResources().getString(R.string.titleValidation));
        btnVerify = findViewById(R.id.buttonVerify);
        btnVerify.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LocaleotpActivity.this, LocaleHomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
