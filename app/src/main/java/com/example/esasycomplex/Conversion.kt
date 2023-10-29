package com.example.esasycomplex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.esasycomplex.databinding.ActivityConversionBinding

class Conversion : AppCompatActivity() {

    private lateinit var binding: ActivityConversionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_conversion)
        binding= ActivityConversionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnbinomica.setOnClickListener{
            val intent = Intent(this, BinomicaConversion::class.java)
            startActivity(intent)
        }
        binding.btnTrigono.setOnClickListener{
            val intent = Intent(this, TrigonoConversion::class.java)
            startActivity(intent)
        }
        binding.btnpolar.setOnClickListener{
            val intent = Intent(this, PolarConversion::class.java)
            startActivity(intent)
        }

        binding.btnRealImag.setOnClickListener{
            binding.mosEc.setImageResource(R.drawable.realimga)
        }
        binding.btnModAng.setOnClickListener{
            binding.mosEc.setImageResource(R.drawable.modang)
        }

    }
}