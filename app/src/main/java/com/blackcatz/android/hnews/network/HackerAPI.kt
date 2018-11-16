package com.blackcatz.android.hnews.network

import com.blackcatz.android.hnews.model.Item
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * API for network request/response
 * @author vinayagasundar
 */
interface HackerAPI {

    @GET("topstories.json")
    fun getTopStories(): Single<List<Long>>


    @GET("item/{itemId}.json")
    fun getItem(@Path("itemId") itemId: String): Single<Item>
}