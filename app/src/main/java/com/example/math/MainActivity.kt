package com.example.math

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        beginbtn.setOnClickListener {
            val begin = Intent(this, step1::class.java)
            startActivity(begin)
        }
        aboutbtn.setOnClickListener {
            val move_about =Intent (this, about::class.java)
            startActivity(move_about)

        }

        exitbtn.setOnClickListener {
            finish()
        }
    }
}
