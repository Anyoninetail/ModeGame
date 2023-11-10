package com.example.modegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class TimerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timer)

        val exitBtn : ImageButton = findViewById(R.id.nagaBtn)
        exitBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val stopwatchBtn : Button = findViewById(R.id.stopwatchMenuBtn)
        stopwatchBtn.setOnClickListener {
            val intent = Intent(this, StopwatchActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}