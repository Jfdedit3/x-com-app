package com.jfdedit3.xcomapp

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout

class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView
    private lateinit var progressBar: ProgressBar
    private lateinit var swipeRefresh: SwipeRefreshLayout

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webView)
        progressBar = findViewById(R.id.progressBar)
        swipeRefresh = findViewById(R.id.swipeRefresh)

        // Configuration WebView optimisée pour X.com
        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webSettings.domStorageEnabled = true
        webSettings.databaseEnabled = true
        webSettings.cacheMode = WebSettings.LOAD_DEFAULT
        webSettings.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        webSettings.userAgentString = webSettings.userAgentString.replace("; wv", "") // Évite la détection WebView
        webSettings.mediaPlaybackRequiresUserGesture = false
        webSettings.allowFileAccess = true
        webSettings.setSupportZoom(true)
        webSettings.builtInZoomControls = false
        webSettings.displayZoomControls = false
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true

        // WebViewClient pour rester dans l'app
        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                return false // Charge tout dans le WebView
            }

            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                progressBar.visibility = View.VISIBLE
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                progressBar.visibility = View.GONE
                swipeRefresh.isRefreshing = false
            }
        }

        webView.webChromeClient = WebChromeClient()

        // Pull to refresh
        swipeRefresh.setOnRefreshListener {
            webView.reload()
        }
        swipeRefresh.setColorSchemeColors(0xFF1D9BF0.toInt()) // Bleu X

        // Charge X.com
        webView.loadUrl("https://x.com")
    }

    // Gestion du bouton retour
    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }

    override fun onDestroy() {
        webView.destroy()
        super.onDestroy()
    }
}
