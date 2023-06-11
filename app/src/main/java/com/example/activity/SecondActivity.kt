package com.example.activity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    lateinit var llSecond : LinearLayout



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)



        val intent = intent
        val name = intent.getStringExtra("Name")
        val roll = intent.getStringExtra("Roll")
        val temp = intent.getStringExtra("Temp")

        llSecond = findViewById(R.id.llSecond)
       val etName1 = llSecond.findViewById<TextView>(R.id.etName1)
        etName1.text =  "Your Name is  $name"
        val etRoll1 = llSecond.findViewById<TextView>(R.id.etRoll1)
        etRoll1.text ="Your Roll No. is  $roll"
        val etTemp1 = llSecond.findViewById<TextView>(R.id.etTemp1)
        etTemp1.text = "Temperature in Your City is  $temp"


    }
}