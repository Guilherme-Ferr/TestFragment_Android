package com.example.testfragment.data.dao

import android.annotation.SuppressLint
import android.content.Context
import com.example.testfragment.R
import com.example.testfragment.model.Console
import com.example.testfragment.model.Game

class gameDataSource {

    companion object {
        fun getGames(context: Context) : ArrayList<Game>{
            var games = ArrayList<Game>()

            games.add(Game(1,
                "Mortal Kombat", context.getDrawable(R.drawable.mortalcumbat)!!,
                "Mortal Kombat tem muito sangue rolando e teta balançando",
                4f,
            listOf(Console(1, "Playstation 1", "Sony", "1996-12-01"),
                Console(2, "SNes", "Nintendo", "1990-12-05"),
                Console(1, "Playstation 3", "Sony", "2007-12-01")))
            )
            games.add(Game(2,
                "Darksiders II", context.getDrawable(R.drawable.dede)!!,
                "Darksiders II tem muito sangue rolando e caveira balançando",
                4.5f,
                listOf(Console(1, "Playstation 3", "Sony", "2007-12-01"),
                    Console(2, "Xbox 360", "Microsoft", "2007-08-14")))
            )
            games.add(Game(3,
                "Stalker COP", context.getDrawable(R.drawable.stalker)!!,
                "S.T.A.L.K.E.R.: Call of Pripyat tem muito sangue rolando e artefato balançando",
                4f,
                listOf(Console(1, "PC", "Microsoft", "1970-12-01")))

            )
            games.add(Game(4,
                "Darksouls III", context.getDrawable(R.drawable.dark)!!,
                "Darksouls III tem muito sangue rolando e cinzeiro balançando",
                4f,
                listOf(Console(1, "Playstation 4", "Sony", "2013-12-01"),
                    Console(2, "Xbox One", "Microsoft", "2013-08-14")))
            )
            return games

        }
    }
}