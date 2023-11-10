package com.example.modegame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timerBtn : ImageButton = findViewById(R.id.timerBtn)
        timerBtn.setOnClickListener {
            val intent = Intent(this, TimerActivity::class.java)
            startActivity(intent)
        }

        val diceBtn : ImageButton = findViewById(R.id.diceBtn)
        diceBtn.setOnClickListener {
            val intent = Intent(this, DiceActivity::class.java)
            startActivity(intent)
        }

        val memoBtn : ImageButton = findViewById(R.id.memoBtn)
        memoBtn.setOnClickListener {
            val intent = Intent(this, MemoActivity::class.java)
            startActivity(intent)
        }

        val rouletteBtn : ImageButton = findViewById(R.id.rouletteBtn)
        rouletteBtn.setOnClickListener {
            val intent = Intent(this, RouletteActivity::class.java)
            startActivity(intent)
        }

        val scoreboardBtn : ImageButton = findViewById(R.id.scoreBtn)
        scoreboardBtn.setOnClickListener {
            val intent = Intent(this, ScoreboardActivity::class.java)
            startActivity(intent)
        }

        val teamBtn : ImageButton = findViewById(R.id.teamBtn)
        teamBtn.setOnClickListener {
            val intent = Intent(this, TeamActivity::class.java)
            startActivity(intent)
        }

        val walletBtn : ImageButton = findViewById(R.id.walletBtn)
        walletBtn.setOnClickListener {
            val intent = Intent(this, WalletActivity::class.java)
            startActivity(intent)
        }
    }
}