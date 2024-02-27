package me.ajith.learning.daggersample.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DbVersion

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DbName

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ApiKey