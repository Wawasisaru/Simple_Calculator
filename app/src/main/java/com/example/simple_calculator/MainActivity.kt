package com.example.simple_calculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    //    @SuppressLint("WrongViewCast")
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val number1EditText = findViewById<EditText>(R.id.editTextNumber)
        val number2EditText = findViewById<EditText>(R.id.editTextNumber2)
        val additionbutton = findViewById<Button>(R.id.etbuttonone)
        val subtrationbutton = findViewById<Button>(R.id.etbuttontwo)
        val divisionbutton = findViewById<Button>(R.id.etbuttonthree)
        val mutiplybutton = findViewById<Button>(R.id.etbuttonfour)
        val TextView = findViewById<TextView>(R.id.ettextViewone)


        additionbutton.setOnClickListener(){
            val numberone = number1EditText.text.toString().toDouble()
            val numbertwo = number2EditText.text.toString().toDouble()
            val answer = numberone + numbertwo
            TextView.text = "Results: $answer"
        }
        subtrationbutton.setOnClickListener(){
            val number1 = number1EditText.text.toString().toDouble()
            val number2 = number2EditText.text.toString().toDouble()
            val answer = number1 - number2
            TextView.text = "Results: $answer"

        }
        divisionbutton.setOnClickListener(){
            val number1 = number1EditText.text.toString().toDouble()
            val number2 = number2EditText.text.toString().toDouble()
            val answer = number1 / number2
            TextView.text = "Results: $answer"

        }
        mutiplybutton.setOnClickListener(){
            val number1 = number1EditText.text.toString().toDouble()
            val number2 = number2EditText.text.toString().toDouble()
            val answer = number1 * number2
            TextView.text = "Results: $answer"
        }


    }
}
