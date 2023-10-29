package com.example.esasycomplex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.esasycomplex.databinding.ActivityOperacionesBasicasBinding

class OperacionesBasicas : AppCompatActivity() {
    private lateinit var binding:ActivityOperacionesBasicasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_operaciones_basicas)
        binding=ActivityOperacionesBasicasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSuma.setOnClickListener{
            val intent = Intent(this, Suma::class.java)
            startActivity(intent)
        }
        binding.btnResta.setOnClickListener{
            val intent = Intent(this, Resta::class.java)
            startActivity(intent)
        }
        binding.btnMultiplicacion.setOnClickListener{
            val intent = Intent(this, Multiplicacion::class.java)
            startActivity(intent)
        }
        binding.btnDivision.setOnClickListener{
            val intent = Intent(this, Division::class.java)
            startActivity(intent)
        }
        binding.btnEcuDiv.setOnClickListener{
            binding.mostrarEc.setImageResource(R.drawable.division)
        }
        binding.btnEcuMul.setOnClickListener{
            binding.mostrarEc.setImageResource(R.drawable.multiplicacion)
        }
        binding.btnEcuRes.setOnClickListener{
            binding.mostrarEc.setImageResource(R.drawable.resta)
        }
        binding.btnEcuSum.setOnClickListener{
            binding.mostrarEc.setImageResource(R.drawable.suma)
        }
    }
}