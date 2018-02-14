package com.alexdev.mobileappdevelopment.activities.session

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.alexdev.mobileappdevelopment.R
import com.alexdev.mobileappdevelopment.activities.home.HomeActivity

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val background = object : Thread(){
            override fun run() {
                try {
                    //After 5 seconds redirect to another intent
                    Thread.sleep((5*1000).toLong())
                    val intent = Intent(baseContext, HomeActivity::class.java)
                    startActivity(intent)
                    //Remove activity
                    finish()
                }catch (e: Exception){
                    e.printStackTrace()
                }
            }
        }
        background.start()
    }
}
