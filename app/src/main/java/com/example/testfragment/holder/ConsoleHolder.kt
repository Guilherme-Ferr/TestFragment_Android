package com.example.testfragment.holder

import android.view.ContextThemeWrapper
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testfragment.R
import com.example.testfragment.model.Console
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class ConsoleHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener {

    val textConsoleName = itemView.findViewById<TextView>(R.id.text_view_console_name)
    val textConsoleDescription = itemView.findViewById<TextView>(R.id.text_view_console_description)
    val textconsoleMakers = itemView.findViewById<TextView>(R.id.text_view_makers)
    val textconsoleReleaseDate = itemView.findViewById<TextView>(R.id.text_view_release)
    val imageConsole = itemView.findViewById<TextView>(R.id.image_console)

    fun bind(console: Console){
        textConsoleName.text = console.nomeConsole
        textConsoleDescription.text = console.consoleDescricao
        textconsoleMakers.text = console.empresaConsole
        textconsoleReleaseDate.text = console.lancamentoConsole
        imageConsole.text = (console.consoleImage)

        itemView.setOnClickListener(this)
    }

    override fun onClick(v: View?) {


    }
}