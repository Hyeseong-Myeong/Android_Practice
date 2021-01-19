package com.mhs.kotlinsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Code when button1 is pressed.
        button1.setOnClickListener {
            startActivity(Intent(this@MainActivity, BmiJavaActivity::class.java))
        }

        button2.setOnClickListener {
            startActivity(Intent(this@MainActivity, BmiKotlinActivity::class.java))
        }

        button3.setOnClickListener {
            startActivity(Intent(this@MainActivity, VariableJavaActivity::class.java))
        }

        button4.setOnClickListener {
            startActivity(Intent(this@MainActivity, VariableKotlinActivity::class.java))
        }
    }
}