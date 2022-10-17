package com.syfsdi.chap6t4.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import androidx.recyclerview.widget.RecyclerView
import com.syfsdi.chap6t4.R

class AdapterNews(private var datanews : List<getAllNewsItem>): RecyclerView.AdapterNews.ViewHolder>() {
    class ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterNews.viewHolder{
        val itemView = LayoutInflater.from(parent.context)
            .inflate((R.layout.item_news))
    }
}