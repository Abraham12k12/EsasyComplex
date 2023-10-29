package com.example.esasycomplex

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.esasycomplex.databinding.ActivityBinomicaConversionBinding

class BinomicaConversion : AppCompatActivity() {
    private lateinit var binding: ActivityBinomicaConversionBinding
    @SuppressLint("StringFormatMatches")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_binomica_conversion)
        binding = ActivityBinomicaConversionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConverBino.setOnClickListener {
            var real: Double?=null
            var imaginario: Double?=null
            if (binding.realnumber.text.isNotEmpty()) {
                real = binding.realnumber.text.toString().toDouble()
            } else {
                binding.realnumber.error = resources.getString(R.string.valor_requrido)
            }
            if (binding.imaginario.text.isNotEmpty()) {
                imaginario = binding.imaginario.text.toString().toDouble()
            } else {
                binding.imaginario.error = resources.getString(R.string.valor_requrido)
            }

            if (real != null && imaginario != null) {
                var modulo = ConvBinoModulo(real, imaginario)
                var angulo = ConvBinoAngulo(real, imaginario)
                var (modulo1, angulo1)=MostrarTrigo(modulo, angulo)
                var (modulo2, angulo2)=MostrarPolar(modulo, angulo)
                binding.tvresultTrigo.text = getString(R.string.mostrarTrigo,modulo1,angulo1)
                binding.tvresulpolar.text = getString(R.string.mostrarPolar,modulo2,angulo2)
            }else{
                Toast.makeText(this, getString(R.string.Ingrese_valores), Toast.LENGTH_LONG).show()
            }
        }
    }
}