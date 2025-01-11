package com.skillbox.a14_room_database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class User(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Int,

    @ColumnInfo(name = "firstName")
    val firstName:String,

    @ColumnInfo(name = "lastName")
    val lastName:String,

    @ColumnInfo(name = "age")
    val age: Int
)
