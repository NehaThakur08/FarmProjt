package com.neha.farmingproject.ui;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.neha.farmingproject.R;
import com.neha.farmingproject.model.Sellers;


public class WebViewSellersActivity extends AppCompatActivity {

    WebView webView;

    void initViews(){

        Intent rcv = getIntent();
        Sellers sellers = (Sellers) rcv.getSerializableExtra("keySellers");



        //getSupportActionBar().setTitle("Amazon");
        //getSupportActionBar().hide();
        getSupportActionBar().setTitle(sellers.name);

        webView = findViewById(R.id.webView);

        //WebViewClient client = new WebViewClient();
        //webView.setWebViewClient(client);
        webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setJavaScriptEnabled(true);

        //webView.loadUrl("https://www.google.co.in");
        //webView.loadUrl("https://www.amazon.in/");
        //webView.loadUrl("https://www.ndtv.com/");
        webView.loadUrl(sellers.quantity);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_sellers);
        initViews();
    }
}
