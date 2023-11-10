package com.example.modegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class StopwatchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stopwatch)

        val exitBtn : ImageButton = findViewById(R.id.nagaBtn)
        exitBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val timerBtn : Button = findViewById(R.id.timerMenuBtn)
        timerBtn.setOnClickListener {
            val intent = Intent(this, TimerActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}