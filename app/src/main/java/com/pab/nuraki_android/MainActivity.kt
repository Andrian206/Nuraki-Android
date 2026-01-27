package com.pab.nuraki_android

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    private lateinit var rvFish: RecyclerView
    private val list = ArrayList<Fish>()

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Apply window insets for edge-to-edge
        val mainContainer = findViewById<View>(R.id.main_container)
        ViewCompat.setOnApplyWindowInsetsListener(mainContainer) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        rvFish = findViewById(R.id.rv_fish)
        rvFish.setHasFixedSize(true)

        list.addAll(getListFish())
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.about_page) {
            val intent = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(intent)
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun getListFish(): ArrayList<Fish> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataScientificName = resources.getStringArray(R.array.data_scientific_name)
        val dataHabitat = resources.getStringArray(R.array.data_habitat)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.obtainTypedArray(R.array.data_photo)
        val listFish = ArrayList<Fish>()
        for (i in dataName.indices) {
            val fish = Fish(
                dataName[i],
                dataScientificName[i],
                dataHabitat[i],
                dataDescription[i],
                dataPhoto.getResourceId(i, -1)
            )
            listFish.add(fish)
        }
        dataPhoto.recycle()
        return listFish
    }

    private fun showRecyclerList() {
        rvFish.layoutManager = LinearLayoutManager(this)
        val listFishAdapter = ListFishAdapter(list)
        rvFish.adapter = listFishAdapter

        listFishAdapter.setOnItemClickCallback(object : ListFishAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Fish) {
                showSelectedFish(data)
            }
        })
    }

    private fun showSelectedFish(fish: Fish) {
        val intent = Intent(this@MainActivity, DetailActivity::class.java)
        intent.putExtra(DetailActivity.EXTRA_FISH, fish)
        startActivity(intent)
    }
}