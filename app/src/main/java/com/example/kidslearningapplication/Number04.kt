package com.example.kidslearningapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Number04 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number04)

        val imageView5: ImageView = findViewById(R.id.imageView16)

        imageView5.setOnClickListener{
            val intent = Intent(this,dashboard::class.java)
            startActivity(intent)
        }

        val imageView6: ImageView = findViewById(R.id.imageView17)

        imageView6.setOnClickListener{
            val intent = Intent(this,Number03::class.java)
            startActivity(intent)
        }
    }
}