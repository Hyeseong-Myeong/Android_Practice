package com.mhs.kotlinsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.layout_veiw_binding.*

class BmiKotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.layout_veiw_binding)

        bmiButton.setOnClickListener {
            val tall = tallField.text.toString().toDouble()
            val weight = weightField.text.toString().toDouble()

            val bmi = weight / Math.pow(tall/100, 2.0);
            resultLabel.text = "키: ${tallField.text}, 체중: ${weightField.text}, BMI: $bmi"
        }
    }
}