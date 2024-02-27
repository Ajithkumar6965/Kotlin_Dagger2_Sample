package me.ajith.learning.daggersample.di.modules

import android.app.Activity
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: Activity) {

    @Provides
    fun providesContext():Activity{
        return activity
    }
}