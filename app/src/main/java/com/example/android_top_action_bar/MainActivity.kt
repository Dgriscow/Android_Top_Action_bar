package com.example.android_top_action_bar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textOutput:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        textOutput = findViewById(R.id.output)




    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.basic_action_menu, menu)

        val expandListener = object : MenuItem.OnActionExpandListener{

            override fun onMenuItemActionCollapse(item: MenuItem): Boolean {
                return true
            }

            override fun onMenuItemActionExpand(item: MenuItem): Boolean {
                return true
            }

        }

        val actionMenuItem = menu?.findItem(R.id.action_favorite)

        actionMenuItem?.setOnActionExpandListener(expandListener)

        return true
    }
    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_settings -> {
            textOutput.text = "Pressed Settings"
            true
        }

        R.id.action_favorite -> {
            textOutput.text = "Pressed favorites Button"
            true
        }

        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}