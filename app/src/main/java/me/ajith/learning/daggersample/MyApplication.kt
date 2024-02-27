package me.ajith.learning.daggersample

import android.app.Application
import android.widget.Toast
import me.ajith.learning.daggersample.data.local.DatabaseService
import me.ajith.learning.daggersample.data.remote.NetworkService
import me.ajith.learning.daggersample.di.components.ApplicationComponent
import me.ajith.learning.daggersample.di.components.DaggerApplicationComponent
import me.ajith.learning.daggersample.di.modules.ApplicationModule
import javax.inject.Inject

class MyApplication : Application() {

    @Inject
    lateinit var databaseService: DatabaseService

    @Inject
    lateinit var networkService: NetworkService

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        getServices()
        showServiceDetails()
    }

    private fun getServices(){
        applicationComponent = DaggerApplicationComponent.builder().applicationModule(
            ApplicationModule(this)
        ).build()
        applicationComponent.inject(this)
    }

    private fun showServiceDetails(){
        Toast.makeText(this,"databaseService : ${databaseService.hashCode()} - networkService : ${networkService.hashCode()}",Toast.LENGTH_LONG).show()
    }
}