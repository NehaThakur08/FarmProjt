package com.neha.farmingproject;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.neha.farmingproject.ui.AllBuyersActivity;
import com.neha.farmingproject.ui.AllSellersActivity;
import com.neha.farmingproject.ui.CropActivity;
import com.neha.farmingproject.ui.ExpertsActivity;
import com.neha.farmingproject.ui.LogoutActivity;
import com.neha.farmingproject.ui.MainActivity;
import com.neha.farmingproject.ui.MainFragment;
import com.neha.farmingproject.ui.MyFragmentsActivity;
import com.neha.farmingproject.ui.RegistrationActivity;

public class SplashActivity extends AppCompatActivity {
    TextView txtSpalsh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        handler.sendEmptyMessageDelayed(101, 2500);
        txtSpalsh= findViewById(R.id.textView2);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.alpha);
        txtSpalsh.startAnimation(animation);

    }

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 101) {
                Intent intent = new Intent(SplashActivity.this, RegistrationActivity.class);
                startActivity(intent);
                finish();
            }

            }

    };
}

