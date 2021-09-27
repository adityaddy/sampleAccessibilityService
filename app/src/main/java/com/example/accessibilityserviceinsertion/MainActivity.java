package com.example.accessibilityserviceinsertion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       WebView mywebview = findViewById(R.id.webView);
//        mywebview.getSettings().setJavaScriptEnabled (true);
//        mywebview.getSettings().setDomStorageEnabled(true);
//        // to access the web content - CORS error
//        // TODO: Deprecation Warning - API Level 30
//        mywebview.getSettings().setAllowUniversalAccessFromFileURLs(true);
        mywebview.loadUrl("file:///android_asset/main.html");

    }
}