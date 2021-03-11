package com.example.testfragment.data.dao

import android.content.Context
import com.example.testfragment.Dao.Database
import com.example.testfragment.model.Console

class ConsoleDataSource {

    companion object {
        fun getConsoles(context: Context) : List<Console>{

            //var consoles = ArrayList<Console>()
            val consoleDao = Database.getDataBase(context).consoleDao()
            return consoleDao.listarTodos()
        }
    }
}
