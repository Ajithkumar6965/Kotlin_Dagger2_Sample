package me.ajith.learning.daggersample.ui.main

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import me.ajith.learning.daggersample.MyApplication
import me.ajith.learning.daggersample.R
import me.ajith.learning.daggersample.data.local.DatabaseService
import me.ajith.learning.daggersample.data.remote.NetworkService
import me.ajith.learning.daggersample.di.components.DaggerMainActivityComponent
import me.ajith.learning.daggersample.di.components.MainActivityComponent
import me.ajith.learning.daggersample.di.modules.ActivityModule
import me.ajith.learning.daggersample.ui.home.HomeFragment
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var activityComponent: MainActivityComponent

    @Inject
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupHomeFragment()
        getService()
        showServiceDetails()
    }

    private fun setupHomeFragment(){
        if(supportFragmentManager.findFragmentByTag(HomeFragment.TAG)==null){
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container,HomeFragment.newInstance())
                .commit()
        }
    }

    private fun getService(){
        activityComponent = DaggerMainActivityComponent.builder().applicationComponent((applicationContext as MyApplication).applicationComponent)
            .activityModule(ActivityModule(this))
            .build()
        activityComponent.inject(this)
    }

    private fun showServiceDetails(){
        Toast.makeText(this,"Service Details : ${mainViewModel.getServiceDetails()}",Toast.LENGTH_LONG).show()
    }
}