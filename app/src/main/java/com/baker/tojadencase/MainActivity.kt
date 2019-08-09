package com.baker.tojadencase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toJadenCase(view: View) {
        if (editTxt.text.isNotEmpty()) {
            val input = editTxt.text.toString()
            val array = input.split(' ')
            val convertedInput = array.map { e -> e.capitalize() }.joinToString(" ")
            resultTxt.text = convertedInput
            editTxt.text.clear()
        } else {
            Toast.makeText(this@MainActivity, "Please type in a sentence first", Toast.LENGTH_SHORT).show()
        }
    }
}
