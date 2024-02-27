package me.ajith.learning.daggersample.di.components

import dagger.Component
import me.ajith.learning.daggersample.di.ActivityScope
import me.ajith.learning.daggersample.di.modules.ActivityModule
import me.ajith.learning.daggersample.ui.main.MainActivity

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface MainActivityComponent {
    fun inject(mainActivity: MainActivity)
}