package com.example.day28project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.day28project.R.id.item1
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val bottomview = findViewById<BottomNavigationView>(R.id.bottomview)
        replaceWithFragement(Home_Fragment())
        bottomview.setOnItemSelectedListener {
            when(it.itemId){
                R.id.item1 -> replaceWithFragement(Home_Fragment())
//                R.id.item2 -> replaceWithFragement(Search())
//                R.id.item3 -> replaceWithFragement(Profile())
                else -> {

                }
            }
            true
        }
    }
    private fun replaceWithFragement(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.framelayout, fragment)
        fragmentTransaction.commit()
    }
}