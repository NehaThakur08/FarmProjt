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
public class SixthFragment extends Fragment implements MyListener {


    WebView webView;

    public SixthFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_sixth_fragment, container, false);

        webView = view.findViewById(R.id.webView5);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
//        webView.loadUrl("https://static.videezy.com/system/resources/previews/000/004/097/original/Clip_16.mp4");
        webView.loadUrl("https://youtu.be/FNn5DB1Zen4");
        return view;
    }

    //    @Override
    public void newsHandler(int position) {
        switch (position){
            case 0:
                webView.loadUrl("https://youtu.be/FNn5DB1Zen4");
                break;

        }
    }
}