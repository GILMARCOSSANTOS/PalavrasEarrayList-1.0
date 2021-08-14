package com.example.palavrasword20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.ArrayAdapter




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview = findViewById<ListView>(R.id.scrollViewId)

        val dados = arrayOf(
            "Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread",
            "Honeycomb", "Ice Cream Sandwich", "Jelly Bean",
            "KitKat", "Lollipop", "Marshmallow", "Nougat",
            "Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread",
            "Honeycomb", "Ice Cream Sandwich", "Jelly Bean",
            "KitKat", "Lollipop", "Marshmallow", "Nougat"        )

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, dados)

        listview.setAdapter(adapter)






            }


}