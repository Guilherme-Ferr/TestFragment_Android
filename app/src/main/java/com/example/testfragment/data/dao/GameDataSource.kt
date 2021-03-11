package com.example.testfragment.data.dao

import android.content.Context
import com.example.testfragment.R
import com.example.testfragment.model.Console
import com.example.testfragment.model.Game

class GameDataSource {

    companion object {
        fun getGames(context: Context) : ArrayList<Game>{
            var games = ArrayList<Game>()

            games.add(Game(1,
                "Mortal Kombat", context.getDrawable(R.drawable.mortalcumbat)!!,
                "Mortal Kombat tem muito sangue rolando e teta balançando",
                4f,
            listOf(Console(1, "Playstation 1", "play 2", "Çony", "1990-12-05", "Imagem Console")
            )))
            games.add(Game(2,
                "Mortal Kombat", context.getDrawable(R.drawable.mortalcumbat)!!,
                "Mortal Kombat tem muito sangue rolando e teta balançando",
                4f,
                listOf(Console(1, "Playstation 1", "play 2", "Çony", "1990-12-05", "Imagem Console")
                )))
            games.add(Game(3,
                "Mortal Kombat", context.getDrawable(R.drawable.mortalcumbat)!!,
                "Mortal Kombat tem muito sangue rolando e teta balançando",
                4f,
                listOf(Console(1, "Playstation 1", "play 2", "Çony", "1990-12-05", "Imagem Console")
                )))
            return games

        }
    }
}
