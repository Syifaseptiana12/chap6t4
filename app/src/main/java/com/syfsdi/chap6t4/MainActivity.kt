package com.syfsdi.chap6t4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.syfsdi.chap6t4.view.AdapterNews

class MainActivity : AppCompatActivity(), Newsview{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenternews = NewsPresenter(this)
        presenternews.getDataNews()
    }

    override fun onSuccess(pesan: String, news: List<getAllNewsItem>){
        rvNews.layoutManager = LinearLayoutManager(this)
        rvNews.adapter =AdapterNews(news)
    }

    overried funError(pesan: String){
        Toast.makeText(this, pesan, Toast.LENGTH_LONG).show()
    }
}