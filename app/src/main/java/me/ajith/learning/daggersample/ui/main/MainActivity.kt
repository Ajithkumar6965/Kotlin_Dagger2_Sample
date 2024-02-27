package me.ajith.learning.daggersample.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.ajith.learning.daggersample.R
import me.ajith.learning.daggersample.ui.home.HomeFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupHomeFragment()
    }

    private fun setupHomeFragment(){
        if(supportFragmentManager.findFragmentByTag(HomeFragment.TAG)==null){
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container,HomeFragment.newInstance())
                .commit()
        }
    }
}