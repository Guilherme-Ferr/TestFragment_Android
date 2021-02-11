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

class ConsoleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val textConsoleName = itemView.findViewById<TextView>(R.id.text_view_console_name)
    val textConsoleDescription = itemView.findViewById<TextView>(R.id.text_view_console_description)
    val imageConsole = itemView.findViewById<ImageView>(R.id.image_console)
    val chipGroupMakers = itemView.findViewById<ChipGroup>(R.id.chip_group_makers)
    val chipGroupRelease = itemView.findViewById<ChipGroup>(R.id.chip_group_release)

    fun bind(console: Console){
        textConsoleName.text = console.consoleName
        textConsoleDescription.text = console.consoleDescription
        imageConsole.setImageDrawable(console.consoleImage)


    }


}