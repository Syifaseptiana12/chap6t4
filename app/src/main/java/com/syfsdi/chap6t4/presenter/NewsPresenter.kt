package com.syfsdi.chap6t4.presenter

import javax.security.auth.callback.Callback

class NewsPresenter(val viewnews : NewsView) {
    fun getDataNews(){
        ApiClient.instane.getAllNews()
            .enqueue(object : Callback<List<getAllNewsItem>>{
                override fun onResponse(
                    call : Callback<List<getAllNewsItem>>
                ){
                    if (resonse)
                }

                )
            }
    }
}