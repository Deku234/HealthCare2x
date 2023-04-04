package com.example.healthcare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton: Button = findViewById(R.id.buttonLogIn)
        myButton.setOnClickListener {

            val intent = Intent(this, Homeactivity::class.java)
            startActivity(intent)
        }
        val myTextView = findViewById<TextView>(R.id.textViewNewUser)
        myTextView.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }



    }
}