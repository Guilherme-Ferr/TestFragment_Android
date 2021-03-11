package com.example.testfragment.Dao

import androidx.room.*
import com.example.testfragment.model.Console

@Dao
interface ConsoleDao {

    @Insert
    fun salvar(console: Console)

    @Update
    fun atualizar(console: Console)

    @Query("SELECT * FROM Console order by nome ASC")
    fun listarTodos() : List<Console>

    @Query("SELECT * FROM Console WHERE id = :id")
    fun listarPorId(id: Int) : Console

    @Delete
    fun excluir(console: Console)
}
