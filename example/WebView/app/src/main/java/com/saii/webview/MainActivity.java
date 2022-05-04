package com.saii.webview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = (WebView) findViewById(R.id.wv_main);

        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        mWebView.addJavascriptInterface(new Object() {
            @JavascriptInterface
            public String showToast(String keyword) {
                Toast.makeText(MainActivity.this, keyword + " 키워드 입력" , Toast.LENGTH_LONG).show();
                String param1 = keyword + " return android - Saii";
                return param1;
            }
        }, "Saii");
        mWebView.loadUrl("file:///android_asset/index.html");

    }
}



