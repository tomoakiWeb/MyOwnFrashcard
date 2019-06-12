package com.example.myownfrashcard

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_word_list.*


class WordListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_list)


        constraintLayoutWordList.setBackgroundResource(intBackGroundColor)

        buttonAddViewWord.setOnClickListener {
            val intent = Intent(this@WordListActivity,EditActivity::class.java)
            intent.putExtra(getString(R.string.intent_key_status),getString(R.string.status_add))
            startActivity(intent)
        }


        buttonBack.setOnClickListener {
            finish()
        }
    }
}
