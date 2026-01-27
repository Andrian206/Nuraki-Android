package com.pab.nuraki_android

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
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

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_container)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        rvFish = findViewById(R.id.rv_fish)
        rvFish.setHasFixedSize(true)
        list.addAll(getListFish())
        showRecyclerList()
    }

    private fun getListFish(): ArrayList<Fish> {
        val dataName = resources.getStringArray(R.array.data_name)
        val dataDescription = resources.getStringArray(R.array.data_description)
        val dataPhoto = resources.obtainTypedArray(R.array.data_photo)
        val listFish = ArrayList<Fish>()
        for (i in dataName.indices) {
            val fish = Fish(dataName[i], dataDescription[i], dataPhoto.getResourceId(i, -1))
            listFish.add(fish)
        }
        return listFish
    }

    private fun showRecyclerList() {
        rvFish.layoutManager = LinearLayoutManager(this)
        val listFishAdapter = ListFishAdapter(list)
        rvFish.adapter = listFishAdapter
    }
}