package com.example.photoframe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var currentImg = 0
    lateinit var image : ImageView
    val names = arrayOf("Virat Kholi", "Cristiano Ronaldo","Elon Musk","MrBeast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val prev = findViewById<ImageButton>(R.id.imgPrev)
        val next = findViewById<ImageButton>(R.id.imgNext)
        var text = findViewById<TextView>(R.id.textView)
        prev.setOnClickListener{
            val currentImageString = "pic$currentImg"
            val currentImageInt = this.resources.getIdentifier(currentImageString, "id", packageName)
            image = findViewById(currentImageInt)
            image.alpha = 0f

            currentImg = (4 + currentImg - 1)%4
            val imageToShowString = "pic$currentImg"
            val imageToShowInt = this.resources.getIdentifier(imageToShowString, "id", packageName)
            image = findViewById(imageToShowInt)
            image.alpha = 1f
            text.text = names[currentImg]
        }

        next.setOnClickListener{
            val currentImageString = "pic$currentImg"
            val currentImageInt = this.resources.getIdentifier(currentImageString, "id", packageName)
            image = findViewById(currentImageInt)
            image.alpha = 0f

            currentImg = (4 + currentImg + 1)%4
            val imageToShowString = "pic$currentImg"
            val imageToShowInt = this.resources.getIdentifier(imageToShowString, "id", packageName)
            image = findViewById(imageToShowInt)
            image.alpha = 1f
            text.text = names[currentImg]
        }
    }
}