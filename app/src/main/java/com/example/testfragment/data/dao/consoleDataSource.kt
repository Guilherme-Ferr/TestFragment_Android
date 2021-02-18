package com.example.testfragment.data.dao

import android.content.Context
import com.example.testfragment.R
import com.example.testfragment.model.Console

class consoleDataSource {

    companion object {
        fun getConsoles(context: Context) : ArrayList<Console>{
            var consoles = ArrayList<Console>()

            consoles.add(Console(1,
                "Xbox 360", context.getDrawable(R.drawable.xbox_trezentos)!!,
                "Xbox 360, o console do secso, foi o console de maior sucesso ",
                "Microsoft",
                "2005/11/22"
            ))
            consoles.add(Console(2,
                "Xbox 360", context.getDrawable(R.drawable.xbox_trezentos)!!,
                "Xbox 360, o console do secso, foi o console de maior sucesso ",
                "Microsoft",
                "2005/11/22"
            ))
            consoles.add(Console(3,
                "Xbox 360", context.getDrawable(R.drawable.xbox_trezentos)!!,
                "Xbox 360, o console do secso, foi o console de maior sucesso ",
                "Microsoft",
                "2005/11/22"
            ))
            return consoles
        }
    }
}