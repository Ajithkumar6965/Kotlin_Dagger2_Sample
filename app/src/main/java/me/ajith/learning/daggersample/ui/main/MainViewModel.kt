package me.ajith.learning.daggersample.ui.main

import me.ajith.learning.daggersample.data.local.DatabaseService
import me.ajith.learning.daggersample.data.remote.NetworkService
import me.ajith.learning.daggersample.di.ActivityScope
import javax.inject.Inject

@ActivityScope
class MainViewModel @Inject constructor(
    private val databaseService: DatabaseService,
    private val networkService: NetworkService
) {

    fun getServiceDetails():String{
        return "databaseService : ${databaseService.hashCode()} - networkService : ${networkService.hashCode()}"
    }
}