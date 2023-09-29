package com.example.newssubspace

import com.example.newssubspace.model.News
import retrofit2.http.GET
import retrofit2.Call
import retrofit2.http.Query

interface ApiInterface {
    @GET("top-headlines")
    fun getTopNews(
        @Query("country") country: String?,
        @Query("apiKey") apiKey: String?,
        @Query("pageSize") pageCount: Int
    ): Call<News>

    @GET("everything")
    fun getNews(
        @Query("q") q: String?,
        @Query("apiKey") apiKey: String?,
        @Query("pageSize") pageCount: Int
    ): Call<News>
}