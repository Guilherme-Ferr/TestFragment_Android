package com.example.testfragment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testfragment.R
import com.example.testfragment.holder.ConsoleHolder
import com.example.testfragment.model.Console

class ConsoleAdapter: RecyclerView.Adapter<ConsoleHolder>() {

    private var consoleList = listOf<Console>()

    fun carregarLista(novaLista: List<Console>){
        consoleList = novaLista
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConsoleHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.holder_console_layout, parent, false)
        return ConsoleHolder(view)
    }

    override fun getItemCount(): Int {
        return consoleList.size
    }

    override fun onBindViewHolder(holder: ConsoleHolder, position: Int) {
        holder.bind(consoleList[position])
    }

}




