package com.example.kidslearningapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val imageView: ImageView = findViewById(R.id.imageView)

        imageView.setOnClickListener{
            val intent =Intent(this,alphabet::class.java)
            startActivity(intent)
        }

        val imageView1: ImageView = findViewById(R.id.imageView8)

        imageView1.setOnClickListener{
            val intent =Intent(this,blue::class.java)
            startActivity(intent)
        }

        val imageView2: ImageView = findViewById(R.id.imageView6)

        imageView2.setOnClickListener{
            val intent =Intent(this,Story01::class.java)
            startActivity(intent)
        }

        val imageView3: ImageView = findViewById(R.id.imageView4)

        imageView3.setOnClickListener{
            val intent =Intent(this,parrot::class.java)
            startActivity(intent)
        }

        val imageView4: ImageView = findViewById(R.id.imageView5)

        imageView4.setOnClickListener{
            val intent =Intent(this,Number01::class.java)
            startActivity(intent)
        }

        val imageView5: ImageView = findViewById(R.id.imageView7)

        imageView5.setOnClickListener{
            val intent =Intent(this,Quiz01::class.java)
            startActivity(intent)
        }
    }
}