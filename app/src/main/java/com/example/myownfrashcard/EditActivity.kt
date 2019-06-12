package com.example.myownfrashcard

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_edit.*

class EditActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        val bundle = intent.extras
        val strStatus = bundle.getString(getString(R.string.intent_key_status))
        textViewStatus.text = strStatus

        if (strStatus == getString(R.string.status_change)){

        }

        constraintLayoutEdit.setBackgroundResource(intBackGroundColor)


        buttonRegister.setOnClickListener {
            if (strStatus == getString(R.string.status_add)) {
                addNewWord()
            } else {
                changeWord()
            }

        }

        buttonBack2.setOnClickListener {

        }

    }

    private fun changeWord() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun addNewWord() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
