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
            listOf(Console(1, "Playstation 1", context.getDrawable(R.drawable.mortalcumbat)!!, "Equibox Snes", "Microsoft", "1990-12-05"),
                Console(2, "SNes", context.getDrawable(R.drawable.mortalcumbat)!!, "Equibox Snes", "Microsoft", "1990-12-05"),
                Console(1, "Playstation 3", context.getDrawable(R.drawable.mortalcumbat)!!, "Equibox Snes", "Microsoft", "1990-12-05")))
            )
            games.add(Game(2,
                "Mortal Kombat", context.getDrawable(R.drawable.mortalcumbat)!!,
                "Mortal Kombat tem muito sangue rolando e teta balançando",
                4f,
                listOf(Console(1, "Playstation 1", context.getDrawable(R.drawable.mortalcumbat)!!, "Equibox Snes", "Microsoft", "1990-12-05"),
                    Console(2, "SNes", context.getDrawable(R.drawable.mortalcumbat)!!, "Equibox Snes", "Microsoft", "1990-12-05"),
                    Console(1, "Playstation 333333", context.getDrawable(R.drawable.mortalcumbat)!!, "Equibox Snes", "Microsoft", "1990-12-05")))
            )
            games.add(Game(3,
                "Mortal Kombat", context.getDrawable(R.drawable.mortalcumbat)!!,
                "Mortal Kombat tem muito sangue rolando e teta balançando",
                4f,
                listOf(Console(1, "Playstation 1", context.getDrawable(R.drawable.mortalcumbat)!!, "Equibox Snes", "Microsoft", "1990-12-05"),
                    Console(2, "SNes", context.getDrawable(R.drawable.mortalcumbat)!!, "Equibox Snes", "Microsoft", "1990-12-05"),
                    Console(1, "Playstation 3", context.getDrawable(R.drawable.mortalcumbat)!!, "Equibox Snes", "Microsoft", "1990-12-05")))
            )
            games.add(Game(4,
                "Mortal Kombat", context.getDrawable(R.drawable.mortalcumbat)!!,
                "Mortal Kombat tem muito sangue rolando e teta balançando",
                4f,
                listOf(Console(1, "Playstation 1", context.getDrawable(R.drawable.mortalcumbat)!!, "Equibox Snes", "Microsoft", "1990-12-05"),
                    Console(2, "SNes", context.getDrawable(R.drawable.mortalcumbat)!!, "Equibox Snes", "Microsoft", "1990-12-05"),
                    Console(1, "Playstation 3", context.getDrawable(R.drawable.mortalcumbat)!!, "Equibox Snes", "Microsoft", "1990-12-05")))
            )
            return games

        }
    }
}
