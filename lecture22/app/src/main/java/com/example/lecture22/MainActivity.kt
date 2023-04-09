package com.example.lecture22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val listview = findViewById<ListView>(R.id.listView)

        val tasklist = arrayListOf<String>()
        tasklist.add("hello this me")
        tasklist.add("iit tathwade")
        tasklist.add("hey, i love you")
        tasklist.add("one side love")
        tasklist.add("hello this me")
        tasklist.add("hello this me")
        tasklist.add("hello this me")

        val adapterForMyList = ArrayAdapter(this, android.R.layout.simple_list_item_1,tasklist)
        listview.adapter = adapterForMyList

        listview.setOnItemClickListener { adapterView, view, i, l ->
            val text = "Clicked on :" + (view as TextView).text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }



    }
}