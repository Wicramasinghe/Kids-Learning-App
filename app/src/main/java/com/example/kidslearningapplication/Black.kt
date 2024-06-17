package com.example.kidslearningapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Black : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_black)

        val imageView1: ImageView = findViewById(R.id.imageView17)

        imageView1.setOnClickListener {
            val intent = Intent(this, Green::class.java)
            startActivity(intent)
        }

        val imageView2: ImageView = findViewById(R.id.imageView16)

        imageView2.setOnClickListener {
            val intent = Intent(this, dashboard::class.java)
            startActivity(intent)
        }

    }
}