package com.example.kidslearningapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.ImageView

class Letters : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_letters)

        var name = intent.getStringExtra("name")?.toLowerCase()
        Toast.makeText(applicationContext,name,Toast.LENGTH_LONG).show()

        var id = resources.getIdentifier(name,"drawable",packageName)
        val imageView: ImageView = findViewById(R.id.imageView3)
        imageView.setImageResource(id)
    }
}