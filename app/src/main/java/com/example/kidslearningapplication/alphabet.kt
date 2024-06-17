package com.example.kidslearningapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import android.widget.GridView

class alphabet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabet)

        val gridView: GridView = findViewById(R.id.grid)

        var alpha = Array<String>(26){""}
        var j = 65
        for(i in 0..25){
            alpha[i]=Character.toString(j.toChar())
            j++
        }

        var adapter = ArrayAdapter<String>(applicationContext,android.R.layout.simple_dropdown_item_1line,alpha)
        gridView.adapter=adapter

        gridView.setOnItemClickListener { adapterView, view, i, _ ->
            var intent = Intent(applicationContext,Letters::class.java)
            intent.putExtra("name",alpha[i])
            startActivity(intent)
        }


    }

}