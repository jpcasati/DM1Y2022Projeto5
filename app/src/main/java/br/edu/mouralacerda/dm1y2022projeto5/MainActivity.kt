package br.edu.mouralacerda.dm1y2022projeto5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var janela: WebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        janela = findViewById<WebView>(R.id.webJanela)

        supportActionBar!!.hide()

        janela!!.settings.javaScriptEnabled = true

        janela!!.webViewClient = WebViewClient()

        janela!!.loadUrl("http://10.0.2.2/")

    }

    override fun onBackPressed() {

        janela!!.goBack()

    }
}