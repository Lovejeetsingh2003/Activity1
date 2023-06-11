package com.example.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast

class FirstActivity : AppCompatActivity() {

    lateinit var llFirst : LinearLayout
    lateinit var etName : EditText
    lateinit var etRoll : EditText
    lateinit var etTemp : EditText
    lateinit var btnMove : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)


        llFirst = findViewById(R.id.llFirst)
        etName = llFirst.findViewById(R.id.etName)
        etRoll = llFirst.findViewById(R.id.etRoll)
        etTemp = llFirst.findViewById(R.id.etTemp)
        btnMove = llFirst.findViewById(R.id.btnMove)



        btnMove.setOnClickListener {
            val name = etName.text.toString()
            val roll = etRoll.text.toString()
            val temp = etTemp.text.toString()


            Toast.makeText(this,"Move",Toast.LENGTH_LONG).show()
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra( "Name",name)
            intent.putExtra("Roll",roll)
            intent.putExtra("Temp",temp)
            startActivity(intent)


        }
    }
}