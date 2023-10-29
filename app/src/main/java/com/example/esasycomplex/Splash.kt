package com.example.esasycomplex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.esasycomplex.databinding.ActivitySplashBinding
import kotlin.concurrent.thread

class Splash : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        thread {
            Thread.sleep(5000)
            val intent=Intent(this, Inicio::class.java)
            //startActivity(Intent(this, Inicio::class.java))
            startActivity(intent)
            finish()
        }
    }
}