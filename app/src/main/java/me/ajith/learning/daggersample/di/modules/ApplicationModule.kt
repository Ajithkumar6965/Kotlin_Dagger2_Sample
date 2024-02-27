package me.ajith.learning.daggersample.di.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import me.ajith.learning.daggersample.data.local.FileStorageService
import me.ajith.learning.daggersample.data.remote.HttpClient
import me.ajith.learning.daggersample.di.ApiKey
import me.ajith.learning.daggersample.di.DbName
import me.ajith.learning.daggersample.di.DbVersion

@Module
class ApplicationModule(private val context: Context) {

    @Provides
    fun providesContext():Context{
        return context
    }

    @DbVersion
    @Provides
    fun providesDbVersion():Int{
        return 1
    }

    @DbName
    @Provides
    fun providesDbName():String{
        return "DUMMY_DB"
    }

    @Provides
    fun providesHttpClient():HttpClient{
        return HttpClient()
    }

    @ApiKey
    @Provides
    fun providesApiKey():String{
        return "API_KEY"
    }

    @Provides
    fun providesFileStorageService():FileStorageService{
        return FileStorageService()
    }
}