package com.example.math

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_win_window.*

class win_window : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_win_window)
        play_again.setOnClickListener {
            val movestep1 = Intent (this, step1::class.java)
            movestep1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(movestep1)
            finish()
        }
        exit_win.setOnClickListener {
            finish()
        }
    }
}
