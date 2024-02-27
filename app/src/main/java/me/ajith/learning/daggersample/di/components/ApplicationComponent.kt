package me.ajith.learning.daggersample.di.components

import dagger.Component
import me.ajith.learning.daggersample.MyApplication
import me.ajith.learning.daggersample.data.local.DatabaseService
import me.ajith.learning.daggersample.data.local.FileStorageService
import me.ajith.learning.daggersample.data.remote.NetworkService
import me.ajith.learning.daggersample.di.ApplicationScope
import me.ajith.learning.daggersample.di.modules.ApplicationModule

@ApplicationScope
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun inject(application: MyApplication)

    fun getNetworkService():NetworkService

    fun getDatabaseService():DatabaseService

    fun getFileStorageService():FileStorageService
}