package me.ajith.learning.daggersample.data.remote

import android.content.Context
import me.ajith.learning.daggersample.di.ApiKey
import me.ajith.learning.daggersample.di.ApplicationScope
import javax.inject.Inject

@ApplicationScope
class NetworkService @Inject constructor(
    val context: Context,
    val httpClient: HttpClient,
    @ApiKey val apiKey:String
) {

}