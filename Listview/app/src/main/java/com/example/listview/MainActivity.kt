  package com.example.listview

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

        val listview = findViewById<ListView>(R.id.listview)

        val tasklist = arrayListOf<String>()
        tasklist.add("Attend the exam")
        tasklist.add("Complete app dev project")
        tasklist.add("Work on resume")
        tasklist.add("go to home")

        val listAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, tasklist)

        listview.adapter = listAdapter

        listview.setOnItemClickListener { adapterView, view, i, l ->
            val text = "Clicked on item " + (view as TextView).text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
    }
}