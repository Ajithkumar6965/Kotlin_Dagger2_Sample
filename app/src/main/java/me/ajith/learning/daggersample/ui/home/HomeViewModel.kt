package me.ajith.learning.daggersample.ui.home

import me.ajith.learning.daggersample.data.local.DatabaseService
import me.ajith.learning.daggersample.data.local.FileStorageService
import me.ajith.learning.daggersample.data.remote.NetworkService
import me.ajith.learning.daggersample.di.FragmentScope
import javax.inject.Inject

@FragmentScope
class HomeViewModel @Inject constructor(
    private val networkService: NetworkService,
    private val databaseService: DatabaseService,
    private val fileStorageService1: FileStorageService,
    private val fileStorageService2: FileStorageService
) {

    fun getServiceDetails():String{
        return "networkService : ${networkService.hashCode()} - databaseService : ${databaseService.hashCode()}"+
                "fileStorageService1 : ${fileStorageService1.hashCode()} - fileStorageService2 : ${fileStorageService2.hashCode()}"
    }
}