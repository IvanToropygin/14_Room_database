package com.skillbox.a14_room_database

import android.app.Application
import androidx.room.Room

class App:Application() {

    lateinit var db: AppDataBase

    override fun onCreate() {
        super.onCreate()

        db = Room.databaseBuilder(
            context = applicationContext,
            klass = AppDataBase::class.java,
            name = "db_user"
        ).build()
    }
}