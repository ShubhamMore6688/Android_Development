package com.example.lecture22project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var userArrayList : ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf("shubham", "yash", "madhav", "nikhil", "pratik")
        val lastMsg = arrayOf("hey, i love you","hello", "how are you","what are you doing", "hi")
        val lastMsgTime = arrayOf("6:25", "6:25", "6:25", "6:25", "6:25")
        val imgId = intArrayOf(
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img6,
            R.drawable.user1,
            R.drawable.user2
        )

        userArrayList = ArrayList()

        for (index in name.indices){
            val user = User(name[index],lastMsg[index], lastMsgTime[index],imgId[index])
            userArrayList.add(user)
        }

        val listview = findViewById<ListView>(R.id.listView)
        listview.adapter = MyAdapter(this, userArrayList)

    }
}