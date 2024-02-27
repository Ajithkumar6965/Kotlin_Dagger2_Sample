package me.ajith.learning.daggersample.di.modules

import android.content.Context
import androidx.fragment.app.Fragment
import dagger.Module
import dagger.Provides
import me.ajith.learning.daggersample.di.FragmentScope

@Module
class FragmentModule(private val fragment: Fragment) {

    @FragmentScope
    @Provides
    fun providesContext():Context{
        return fragment.requireContext()
    }
}