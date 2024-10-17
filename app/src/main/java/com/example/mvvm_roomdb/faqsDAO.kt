package com.example.mvvm_roomdb

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.RoomDatabase
@Dao
interface faqsDAO{
    @Insert
    suspend fun insertFaq(faqs: faqs)
    @Query("Select * from qoute")
    fun getfaqs():LiveData<List<faqs>>
}
