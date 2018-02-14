package com.alexdev.mobileappdevelopment.activities.unit_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.alexdev.mobileappdevelopment.R

class HelloWordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_word)
    }
    companion object Factory {
        fun create(): HelloWordActivity = HelloWordActivity()
    }
}
