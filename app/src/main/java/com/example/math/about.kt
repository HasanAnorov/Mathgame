package com.example.math

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_about.*

class about : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        back_about.setOnClickListener {
            val backmain = Intent(this, MainActivity::class.java)
            backmain.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(backmain)
            finish()
        }
    }
}
