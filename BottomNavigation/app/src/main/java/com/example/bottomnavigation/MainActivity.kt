package com.example.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val bottomview = findViewById<BottomNavigationView>(R.id.bottomNavigation)

        replaceWithFragement(Home())

        bottomview.setOnItemSelectedListener {
            when(it.itemId){
                R.id.item1 -> replaceWithFragement(Home())
                R.id.item2 -> replaceWithFragement(Search())
                R.id.item3 -> replaceWithFragement(Profile())
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