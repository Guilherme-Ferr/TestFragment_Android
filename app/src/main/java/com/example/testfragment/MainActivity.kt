package com.example.testfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testfragment.adapter.ConsoleAdapter
import com.example.testfragment.Dao.Database
import com.example.testfragment.fragments.ConsoleFragment
import com.example.testfragment.fragments.GameFragment
import com.example.testfragment.fragments.HomeFragment
import com.example.testfragment.model.Console
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), View.OnClickListener, BottomNavigationView. OnNavigationItemSelectedListener, NavigationView.OnNavigationItemSelectedListener {


    private lateinit var buttonNovoConsole: ImageButton
    private lateinit var editNome: EditText
    private lateinit var editDescricao: EditText
    private lateinit var editEmpresa: EditText
    private lateinit var editLancamento: EditText
    private lateinit var editImagemConsole: EditText
    private lateinit var buttonSalvar: Button
    private lateinit var buttonCancelar: Button
    private lateinit var dialog: AlertDialog
    private lateinit var recyclerConsoles: RecyclerView

    private lateinit var homeFragment: HomeFragment
    private lateinit var gameFragment: GameFragment
    private lateinit var consoleFragment: ConsoleFragment

    private lateinit var bottomNavigation: BottomNavigationView

    private lateinit var navigationView: NavigationView

    private lateinit var toolbar: Toolbar

    private lateinit var drawer: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawer_navigation_layout)

        buttonNovoConsole = findViewById(R.id.button_add_console)
        buttonNovoConsole.setOnClickListener(this)
        recyclerConsoles = findViewById(R.id.recycler_view_consoles)

        exibirConsoles()

        homeFragment = HomeFragment()
        consoleFragment = ConsoleFragment()
        gameFragment = GameFragment()

        bottomNavigation = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener(this)

        navigationView = findViewById(R.id.navigation_view)
        navigationView.setNavigationItemSelectedListener(this)

        toolbar = findViewById(R.id.toolbar)
        toolbar.title="Home"
        setSupportActionBar(toolbar)

        drawer = findViewById(R.id.drawer)

        //Adicionar otão que abre o drawer menu
        var toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.open_drawer, R.string.close_drawer)

        drawer.addDrawerListener(toggle)
        toggle.syncState()

        setFragment(homeFragment)
    }

    override fun onClick(v: View) {

        if(v.id == R.id.button_add_console) {
            abrirCadastroConsole()
        } else if(v.id == R.id.button_cancelar) {
            dialog.dismiss()
        } else if (v.id == R.id.button_salvar){
            salvarConsoles()
        } else {
            exibirConsoles()
        }

    }


    private fun exibirConsoles() {


        val consoleDao = Database.getDataBase(this).consoleDao()

        val consoles = consoleDao.listarTodos()

        //Definir o layout da recyclerView
        recyclerConsoles.layoutManager = LinearLayoutManager(this)

        //Instanciar o adapter que sera usado pela RecyclerView para carregar os dados
        val adapter = ConsoleAdapter()
        adapter.carregarLista(consoles)
        //Definir o adapter que sera usado pela RecyclerView
        recyclerConsoles.adapter = adapter
    }


    private fun salvarConsoles() {

        var console = Console(nomeConsole = editNome.text.toString(),
            consoleDescricao = editDescricao.text.toString(),
            empresaConsole = editEmpresa.text.toString(),
            lancamentoConsole = editLancamento.text.toString(),
            consoleImage = editImagemConsole.text.toString())


//        val db = Room.databaseBuilder(
//            this,
//            AppDataBase::class.java,
//            "db_contato").allowMainThreadQueries().build()

        val consoleDao = Database.getDataBase(this).consoleDao()

        consoleDao.salvar(console)

        exibirConsoles()

        dialog.dismiss()

    }


    private fun abrirCadastroConsole() {

        val alertDialog = AlertDialog.Builder(this)
        val view = layoutInflater.inflate(R.layout.cadastro_console_dialog, null)
        alertDialog.setView(view)

        editNome = view.findViewById(R.id.edit_nome)
        editEmpresa = view.findViewById(R.id.edit_empresa)

        buttonSalvar = view.findViewById(R.id.button_salvar)
        buttonCancelar = view.findViewById(R.id.button_cancelar)

        buttonCancelar.setOnClickListener(this)
        buttonSalvar.setOnClickListener(this)

        dialog = alertDialog.create()
        dialog.setCancelable(false)
        dialog.show()


        //alertDialog.setCancelable(false).create().show()

    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
             R.id.menu_home -> {
                 toolbar.title="Home"
                setFragment(homeFragment)
             }
             R.id.menu_consoles -> {
                 toolbar.title="Consoles"
                 setFragment(consoleFragment)
             }
             R.id.menu_games -> {
                 toolbar.title="Games"
                setFragment(gameFragment)
             }
        }
        //Selecionar o item de menu correto na BottomNavigationView
        var selectedMenu = bottomNavigation.menu.findItem(item.itemId)
        selectedMenu.setChecked(true)

        //Fechar o Drawer se estiver aberto
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START)
        }

        return true
    }

    fun setFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame, fragment)
            .commit()
    }
}