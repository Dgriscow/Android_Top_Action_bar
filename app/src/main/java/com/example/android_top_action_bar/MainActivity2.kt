package com.example.android_top_action_bar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

//This view is the MAIN VIEW the app will start on
class MainActivity2 : AppCompatActivity() {
    lateinit var pressMeButton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        pressMeButton = findViewById(R.id.transferButton)



        pressMeButton.setOnClickListener {
            val nextScreen = Intent(this@MainActivity2, MainActivity::class.java)
            startActivity(nextScreen)
        }


    }
}