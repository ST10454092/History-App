package com.example.task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bronaldo = findViewById<Button>(R.id.button6)
        val bstalin = findViewById<Button>(R.id.button)
        val blennon = findViewById<Button>(R.id.button7)
        val bjordan = findViewById<Button>(R.id.button1)
        val blouis = findViewById<Button>(R.id.button4)
        val bcharl = findViewById<Button>(R.id.button3)
        val bcavil = findViewById<Button>(R.id.button5)
        val bleo = findViewById<Button>(R.id.button2)

        bronaldo.setOnClickListener { val intent = Intent(this, Cristiano_Ronaldo::class.java)
        startActivity(intent)}
        blouis.setOnClickListener { val intent = Intent(this, Joe_Louis::class.java)
            startActivity(intent)}
        bcharl.setOnClickListener { val intent = Intent(this, Charlie_Chaplin::class.java)
            startActivity(intent)}
        bcavil.setOnClickListener { val intent = Intent(this, Henry_Cavill::class.java)
            startActivity(intent)}
        bleo.setOnClickListener { val intent = Intent(this, Leonardo::class.java)
            startActivity(intent)}
        bstalin.setOnClickListener { val intent = Intent(this, Joseph_Stalin::class.java)
            startActivity(intent)}
        blennon.setOnClickListener { val intent = Intent(this, John_Lennon::class.java)
            startActivity(intent)}
        bjordan.setOnClickListener { val intent = Intent(this, Michael_Jordan::class.java)
            startActivity(intent)}
    }
}