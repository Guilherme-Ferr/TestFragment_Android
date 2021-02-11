package com.example.testfragment.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testfragment.R
import com.example.testfragment.adapter.GameAdapter
import com.example.testfragment.data.dao.consoleDataSource
import com.example.testfragment.data.dao.gameDataSource
import com.example.testfragment.model.Console
import com.example.testfragment.model.Game


class ConsoleFragment : Fragment() {

    private lateinit var recyclerConsoles: RecyclerView
    private val consoleAdapter = GameAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_console, container, false)

        //Instanciar a RecyclerView
        recyclerConsoles = view.findViewById(R.id.recycler_view_consoles)

        //Determinar a orientação da recycler view
        recyclerConsoles.layoutManager = LinearLayoutManager(view.context, LinearLayoutManager.HORIZONTAL, false);

        //Informar para a recyclerview qual é o adapater que ela vai usar
        recyclerConsoles.adapter = consoleAdapter

        //Tornar o menu visivel
        setHasOptionsMenu(true)

        return view
    }


}