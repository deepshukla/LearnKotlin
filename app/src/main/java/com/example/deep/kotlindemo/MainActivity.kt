package com.example.deep.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        findViewById<TextView>(R.id.textView).text = "deep"


    }


    fun main(parameterName: Array<String>) {

        print("hello")
    }
}