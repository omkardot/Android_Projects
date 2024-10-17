package com.example.mvvm_roomdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration

@Database( entities = [faqs::class], version = 2)
abstract class faqsDatabase:RoomDatabase() {
    abstract fun faqsDao():faqsDAO
    companion object{
        private var INSTANCE:faqsDatabase?=null
        fun getInstance(context: Context):faqsDatabase{
            val migration_1_2 = Migration(1,2){
//                it.execSQL("ALTER TABLE qtes RENAME COLUMN qoutes to quote")
            }
            if(INSTANCE==null){
                synchronized(this){
                    INSTANCE= Room.databaseBuilder(context.applicationContext,faqsDatabase::class.java,"qoutes")
                        .createFromAsset("quotes.db")
                        .addMigrations(migration_1_2)
                        .build()
                }
            }
            return INSTANCE!!
        }
    }
}