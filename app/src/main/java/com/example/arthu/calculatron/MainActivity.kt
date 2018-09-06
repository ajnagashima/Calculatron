package com.example.arthu.calculatron

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*;
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val input1 = findViewById<TextView>(R.id.editText3) as EditText
        val input2 = findViewById<TextView>(R.id.editText2) as EditText
        val text = findViewById<TextView>(R.id.text) as TextView

        val add = findViewById<Button>(R.id.add) as Button
        val sub = findViewById<Button>(R.id.sub) as Button
        val mul = findViewById<Button>(R.id.mul) as Button
        val div = findViewById<Button>(R.id.div) as Button



        add.setOnClickListener{
            val total: Int = input1.text.toString().toInt() + input2.text.toString().toInt()
            text.text = total.toString()
        }
        sub.setOnClickListener{
            val total: Int = input1.text.toString().toInt() - input2.text.toString().toInt()
            text.text = total.toString()
        }
        mul.setOnClickListener{
            val total: Int = input1.text.toString().toInt() * input2.text.toString().toInt()
            text.text = total.toString()
        }
        div.setOnClickListener{
            val total: Int = input1.text.toString().toInt() / input2.text.toString().toInt()
            text.text = total.toString()
        }
    }
}
