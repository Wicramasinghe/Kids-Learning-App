package com.example.kidslearningapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Quiz01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz01)

        val imageView5: ImageView = findViewById(R.id.imageView16)

        imageView5.setOnClickListener{
            val intent = Intent(this,Quiz02::class.java)
            startActivity(intent)
        }

        val imageView6: ImageView = findViewById(R.id.imageView17)

        imageView6.setOnClickListener{
            val intent =Intent(this,dashboard::class.java)
            startActivity(intent)
        }
    }
}