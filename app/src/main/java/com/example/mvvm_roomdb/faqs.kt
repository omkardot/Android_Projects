package com.example.mvvm_roomdb

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "qoute")
data class faqs(
    @PrimaryKey(autoGenerate = true)
    val id :Int,
    val text:String,
    val auther:String
)
