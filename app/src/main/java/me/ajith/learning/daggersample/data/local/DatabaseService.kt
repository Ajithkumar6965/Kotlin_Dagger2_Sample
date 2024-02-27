package me.ajith.learning.daggersample.data.local

import android.content.Context
import me.ajith.learning.daggersample.di.ApplicationScope
import me.ajith.learning.daggersample.di.DbName
import me.ajith.learning.daggersample.di.DbVersion
import javax.inject.Inject

@ApplicationScope
class DatabaseService @Inject constructor(
    val context: Context,
    @DbVersion val dbVersion:Int,
    @DbName val databaseName:String
) {

}