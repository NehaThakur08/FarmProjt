package com.neha.farmingproject.ui;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.neha.farmingproject.R;
import com.neha.farmingproject.model.MyListener;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends Fragment implements MyListener {


    WebView webView;

    public ThirdFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_third_fragment, container, false);

        webView = view.findViewById(R.id.webView2);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
//        webView.loadUrl("https://ak8.picdn.net/shutterstock/videos/1012843388/preview/stock-footage-wheat-grain-in-a-hand-after-good-harvest-of-successful-farmer-in-a-background-agricultural.webm");
        webView.loadUrl("https://youtu.be/oUJovsErW4A");
        return view;
    }

    //    @Override
    public void newsHandler(int position) {
        switch (position){
            case 0:
                webView.loadUrl("https://youtu.be/oUJovsErW4A");

//                webView.loadUrl("https://ak8.picdn.net/shutterstock/videos/1012843388/preview/stock-footage-wheat-grain-in-a-hand-after-good-harvest-of-successful-farmer-in-a-background-agricultural.webmk");
                break;

        }
    }
}