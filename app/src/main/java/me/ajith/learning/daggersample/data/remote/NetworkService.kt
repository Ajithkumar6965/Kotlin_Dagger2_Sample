package me.ajith.learning.daggersample.data.remote

import android.content.Context

class ApiService(
    val context: Context,
    val httpClient: HttpClient,
    val apiKey:String
) {

}