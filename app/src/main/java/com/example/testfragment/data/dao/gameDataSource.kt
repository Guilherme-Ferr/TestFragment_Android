package com.example.testfragment.data.dao

import android.content.Context
import com.example.testfragment.R
import com.example.testfragment.model.Console
import com.example.testfragment.model.Game

class gameDataSource {

    companion object {
        fun getGames(context: Context) : ArrayList<Game>{
            var games = ArrayList<Game>()

            games.add(Game(1,
                            "Mortal Kombat", context.getDrawable(R.drawable.mortalCumbat)!!,
                            "Mortal Kombat tem muito sangue rolando e teta balançando",
                            4.5,
            listOf(Console(1, "Playstation 1", "Sony", "1996-12-01"),
            Console(2, "SNes", "Nintendo", "1990-12-05")))
            )
            games.add(Game(2,
                "Darksiders II", context.getDrawable(R.drawable.dede)!!,
                "Darksiders II tem muito sangue rolando e caveira balançando",
                4.5,
                listOf(Console(1, "Playstation 3", "Sony", "1996-12-01"),
                    Console(2, "Xbox 360", "Microsoft", "2012-08-14")))
            )
            games.add(Game(2,
                "Darksiders II", context.getDrawable(R.drawable.dede)!!,
                "Darksiders II tem muito sangue rolando e caveira balançando",
                4.5,
                listOf(Console(1, "Playstation 3", "Sony", "1996-12-01"),
                    Console(2, "Xbox 360", "Microsoft", "2012-08-14")))
            )
            games.add(Game(2,
                "Darksiders II", context.getDrawable(R.drawable.dede)!!,
                "Darksiders II tem muito sangue rolando e caveira balançando",
                4.5,
                listOf(Console(1, "Playstation 3", "Sony", "1996-12-01"),
                    Console(2, "Xbox 360", "Microsoft", "2012-08-14")))
            )
            return games

        }
    }
}