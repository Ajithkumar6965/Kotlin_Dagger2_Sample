package me.ajith.learning.daggersample.di.components

import dagger.Component
import me.ajith.learning.daggersample.di.FragmentScope
import me.ajith.learning.daggersample.di.modules.FragmentModule
import me.ajith.learning.daggersample.ui.home.HomeFragment

@FragmentScope
@Component(dependencies = [ApplicationComponent::class], modules = [FragmentModule::class])
interface FragmentComponent {
    fun inject(homeFragment: HomeFragment)
}