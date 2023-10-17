package com.minadag.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.view.ViewPropertyAnimatorListener
import com.minadag.kotlincalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    /*
    var number1 : Double? = null
    var number2 : Double? = null
    var result : Double? = null

    bu sekilde tanımlayıp tum fonksiyonlarda tekrar tanımlamadan kullanabiliriz
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
        fun mySum ( view: View) {

            val number1 = binding.number1Text.text.toString().toIntOrNull()
            val number2 = binding.number2Text.text.toString().toIntOrNull()

            if ( number1 != null && number2 != null){
                val result = number1 + number2
                binding.resultText.text = "Result ${result}"
            } else {
                binding.resultText.text = "Please Enter Number!"
            }

        }

        fun mySub ( view: View) {

            val numb1 = binding.number1Text.text.toString().toIntOrNull()
            val numb2 = binding.number2Text.text.toString().toIntOrNull()

            if (numb1 != null && numb2 != null){
                val result = numb1 - numb2
                binding.resultText.text = "Result ${result}"
            } else {
                binding.resultText.text = "Please Enter Number"
            }

        }

        fun myMultiply ( view: View) {

            val num1 = binding.number1Text.text.toString().toDoubleOrNull()
            val num2 = binding.number2Text.text.toString().toDoubleOrNull()

            if (num1 != null && num2 != null) {
                val result = num1 * num2
                binding.resultText.text = "Result: ${result}"
            } else {
                binding.resultText.text = "Please Enter Number"
            }

        }

        fun myDiv ( view: View) {

            val no1 = binding.number1Text.text.toString().toDoubleOrNull()
            val no2 = binding.number2Text.text.toString().toDoubleOrNull()

            if (no1 != null && no2 != null) {
                val result = no1 / no2
                binding.resultText.text = "Result: ${result}"
            } else {
                binding.resultText.text = "Please Enter Number"
            }

        }

}