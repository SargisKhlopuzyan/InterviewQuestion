package com.example.sargiskh.interviewquestion

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val secondMaxElement = FindSecondMaxElementClass.findSecondMaxElement(FindSecondMaxElementClass.getRandomIntegerList())
        Log.e("LOG_TAG", "secondMaxElement: $secondMaxElement")
    }
}
