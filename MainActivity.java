package com.cookandroid.project6_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtUrl;
    Button btnGo, btnBck;
    WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("이정원");
        edtUrl = findViewById(R.id.edtUrl);
        btnGo = findViewById(R.id.btnGo);
        btnBck = findViewById(R.id.btnBck);
        webView1 = findViewById(R.id.webView1);
        webView1.setWebViewClient(new CookwebViewClient());
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView1.loadUrl(edtUrl.getText().toString());
            }
        });
        btnBck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView1.goBack();
            }
        });
    }
    class CookwebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}