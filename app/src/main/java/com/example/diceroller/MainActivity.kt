package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        class Dice (val numSides: Int) {

            fun roll() : Int {
                return (1..numSides).random()
            }
        }
        val firstDice = Dice(6)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val resultTextView : TextView = findViewById(R.id.textView)
            val number = firstDice.roll()
            resultTextView.text = "$number"
        }
    }
}