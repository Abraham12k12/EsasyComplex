package com.example.esasycomplex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.esasycomplex.databinding.ActivityInicioBinding

class Inicio : AppCompatActivity() {
    private lateinit var binding: ActivityInicioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_inicio)

        binding = ActivityInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnconvertir.setOnClickListener{
            val intent = Intent(this, Conversion::class.java)
            startActivity(intent)
        }

        binding.btnoperaciones.setOnClickListener{
            val intent = Intent(this, OperacionesBasicas::class.java)
            startActivity(intent)
        }
    }
}