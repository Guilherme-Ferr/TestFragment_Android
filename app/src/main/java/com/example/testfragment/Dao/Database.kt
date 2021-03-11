package com.example.testfragment.Dao

import android.content.Context
import androidx.room.Room

class Database {
    companion object {

        fun getDataBase(context: Context) : AppDataBase {
            return Room.databaseBuilder(
                context,
                AppDataBase::class.java,
                "db_contato").allowMainThreadQueries().build()

        }
    }
}
