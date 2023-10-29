package com.example.esasycomplex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.esasycomplex.databinding.ActivityPolarConversionBinding

class PolarConversion : AppCompatActivity() {
    private lateinit var binding: ActivityPolarConversionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_polar_conversion)
        binding= ActivityPolarConversionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ConverPolar.setOnClickListener {
            var modulo: Double?=null
            var angulo: Double?=null
            if (binding.modulo.text.isNotEmpty()) {
                modulo = binding.modulo.text.toString().toDouble()
            } else {
                binding.modulo.error = resources.getString(R.string.valor_requrido)
            }
            if (binding.angulo.text.isNotEmpty()) {
                angulo = binding.angulo.text.toString().toDouble()
            } else {
                binding.angulo.error = resources.getString(R.string.valor_requrido)
            }
            Toast.makeText(this, getString(R.string.Ingrese_valores), Toast.LENGTH_LONG).show()
            if (modulo != null && angulo != null) {
                val real = ConvModulReal(modulo, angulo)
                val imaginario = ConvModulImaginario(modulo, angulo)
                var (modulo1, angulo1)= MostrarBino(real, imaginario)
                var (modulo2, angulo2)= MostrarTrigo(modulo, angulo)
                binding.tvresultBin.text = getString(R.string.mostrarBino,modulo1,angulo1)
                binding.tvresultrigo.text = getString(R.string.mostrarTrigo,modulo2,angulo2)
            }
        }
    }
}