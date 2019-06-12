package com.example.myownfrashcard

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

var intBackGroundColor = 0

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonEdit.setOnClickListener {
            val intent = Intent(this@MainActivity, WordListActivity::class.java)
            startActivity(intent)
        }




        button01.setOnClickListener {
            intBackGroundColor = R.color.color01
            constraintLayoutMain.setBackgroundResource(intBackGroundColor)
        }
        button02.setOnClickListener {
            intBackGroundColor = R.color.color02
            constraintLayoutMain.setBackgroundResource(intBackGroundColor)
        }
        button03.setOnClickListener {
            intBackGroundColor = R.color.color03
            constraintLayoutMain.setBackgroundResource(intBackGroundColor)
        }
        button04.setOnClickListener {
            intBackGroundColor = R.color.color04
            constraintLayoutMain.setBackgroundResource(intBackGroundColor)
        }
        button05.setOnClickListener {
            intBackGroundColor = R.color.color05
            constraintLayoutMain.setBackgroundResource(intBackGroundColor)
        }
        button06.setOnClickListener {
            intBackGroundColor = R.color.color06
            constraintLayoutMain.setBackgroundResource(intBackGroundColor)
        }
    }
}
