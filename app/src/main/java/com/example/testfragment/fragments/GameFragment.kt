package com.example.testfragment.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testfragment.R
import com.example.testfragment.adapter.GameAdapter
import com.example.testfragment.data.dao.GameDataSource
import com.example.testfragment.model.Game


class GameFragment : Fragment() {

    private lateinit var recyclerGames: RecyclerView
    private val gameAdapter = GameAdapter()
    private var gameList = listOf<Game>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_game, container, false)

        //Instanciar a RecyclerView
        recyclerGames = view.findViewById(R.id.recycler_view_games)

        //Determinar a orientação da recycler view
        recyclerGames.layoutManager = LinearLayoutManager(view.context);

        //Informar para a recyclerview qual é o adapater que ela vai usar
        recyclerGames.adapter = gameAdapter

        //Dizer ao adapter qual é a fonte de dados
        gameList = GameDataSource.getGames(view.context)

        //Atualizar a lista de jogos do adapter
        gameAdapter.updateGameList(gameList)

        //Tornar o menu visivel
        setHasOptionsMenu(true)

        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_game, menu)
    }


}