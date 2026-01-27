package com.pab.nuraki_android

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_FISH = "extra_fish"
    }

    private var fish: Fish? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)

        val detailContainer = findViewById<View>(R.id.detail_container)
        ViewCompat.setOnApplyWindowInsetsListener(detailContainer) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val toolbar: Toolbar = findViewById(R.id.toolbar_detail)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        toolbar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        // Get fish data from intent
        fish = intent.getParcelableExtra<Fish>(EXTRA_FISH)

        fish?.let {
            setupViews(it)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_detail, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.action_share) {
            shareFish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun shareFish() {
        fish?.let {
            val shareText = "Check out this fish!\n\n" +
                    "Name: ${it.name}\n" +
                    "Scientific Name: ${it.scientificName}\n" +
                    "Habitat: ${it.habitat}\n\n" +
                    "Description: ${it.description}"

            val shareIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, shareText)
                type = "text/plain"
            }
            startActivity(Intent.createChooser(shareIntent, "Share via"))
        }
    }

    private fun setupViews(fish: Fish) {
        val imgPhoto: ImageView = findViewById(R.id.img_detail_photo)
        val tvName: TextView = findViewById(R.id.tv_detail_name)
        val tvScientificName: TextView = findViewById(R.id.tv_detail_scientific_name)
        val tvHabitat: TextView = findViewById(R.id.tv_detail_habitat)
        val tvDescription: TextView = findViewById(R.id.tv_detail_description)

        imgPhoto.setImageResource(fish.photo)
        tvName.text = fish.name
        tvScientificName.text = fish.scientificName
        tvHabitat.text = fish.habitat
        tvDescription.text = fish.description

        supportActionBar?.title = fish.name
    }
}
