package com.example.tictactoeonline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.tictactoeonline.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstbtn = findViewById<Button>(R.id.play_offline_btn)

        firstbtn.setOnClickListener{
            val intent = Intent(this,GameActivity::class.java)
        }

    }
}