package com.kolin.inteents_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Connecting our button to its id in the layout
        val button = findViewById<Button>(R.id.nxtbtn)
        button.setOnClickListener {
            //create a variable for intent
            val i = Intent(this,HomeActivity::class.java)
            startActivity(i)
        }




    }
}