package com.example.dialoguebox

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.dialoguebox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

//        binding.btn1.setOnClickListener {
//            val builder1 = AlertDialog.Builder(this)
//            builder1.setTitle("Are you sure?")
//            builder1.setMessage("Do you want to close the app")
//            builder1.setIcon(R.drawable.exit)
//            builder1.setPositiveButton("YES", DialogInterface.OnClickListener { dialogInterface, i ->
//                finish()
//            })
//            builder1.setNegativeButton("NO", DialogInterface.OnClickListener { dialogInterface, i ->
//
//            })
//            builder1.show()
//        }

        binding.btn1.setOnClickListener {
            val option = arrayOf("C", "C++", "JAVA")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is your favorite programming language?")
            builder2.setSingleChoiceItems(option, 0, DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "You choose ${option[i]}", Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("SUBMIT", DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder2.setNegativeButton("CANCEL", DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder2.show()
        }

        binding.btn2.setOnClickListener {
            val option = arrayOf("Android Development", "Machine Learning", "Cloud Computing")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Choose Technologies you know")
            builder2.setMultiChoiceItems(option, null, DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->
                Toast.makeText(this, "You choose ${option[i]}", Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("SUBMIT", DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder2.setNegativeButton("CANCEL", DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder2.show()
        }

        binding.btnExit.setOnClickListener {
            val builder3 = AlertDialog.Builder(this)
            builder3.setTitle("Are you sure?")
            builder3.setMessage("Do you want to close the app")
            builder3.setIcon(R.drawable.exit)
            builder3.setPositiveButton("YES", DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder3.setNegativeButton("NO", DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder3.show()
        }
    }
}