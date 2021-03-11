package com.example.testfragment.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Console (
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,

    @ColumnInfo(name = "nome")
    var nomeConsole: String,

    @ColumnInfo(name = "descricao")
    var consoleDescricao: String,

    @ColumnInfo(name = "empresa")
    var empresaConsole: String?,

    @ColumnInfo(name = "ano")
    var lancamentoConsole: String?,

    @ColumnInfo(name = "imagem")
    var consoleImage: String?


) {

}