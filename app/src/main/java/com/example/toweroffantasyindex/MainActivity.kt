package com.example.toweroffantasyindex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.toweroffantasyindex.simulacra.SimulacraAdapter
import com.example.toweroffantasyindex.simulacra.SimulacraData
import com.example.toweroffantasyindex.simulacra.SimulacraModel

class MainActivity : AppCompatActivity() {
    private lateinit var rvSimulacra: RecyclerView
    private var list: ArrayList<SimulacraModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionbar = supportActionBar
        actionbar!!.title= "TOF Simulacra Index"

        rvSimulacra = findViewById(R.id.rv_simulacra)
        rvSimulacra.setHasFixedSize(true)

        list.addAll(SimulacraData.listData)
        showRecyclerList()
    }
    private fun showRecyclerList() {
        rvSimulacra.layoutManager = LinearLayoutManager(this)
        val simulacraAdapter = SimulacraAdapter(list)
        rvSimulacra.adapter = simulacraAdapter
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.menuAbout -> {
                val iAbout = Intent(this@MainActivity,
                    About::class.java)
                startActivity(iAbout)
            }
        }
    }
}