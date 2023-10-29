package com.example.esasycomplex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.esasycomplex.databinding.ActivitySumaBinding

class Suma : AppCompatActivity() {
    private lateinit var binding: ActivitySumaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_suma)
        binding=ActivitySumaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSumaBino.setOnClickListener {
            var numA: Double?=null
            var numB: Double?=null
            var numC: Double?=null
            var numD: Double?=null
            if (binding.SumCajaABin.text.isNotEmpty()) {
                numA = binding.SumCajaABin.text.toString().toDouble()
            } else {
                binding.SumCajaABin.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.SumCajaBBin.text.isNotEmpty()) {
                numB = binding.SumCajaBBin.text.toString().toDouble()
            } else {
                binding.SumCajaBBin.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.SumCajaCBin.text.isNotEmpty()) {
                numC = binding.SumCajaCBin.text.toString().toDouble()
            } else {
                binding.SumCajaCBin.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.SumCajaDBin.text.isNotEmpty()) {
                numD = binding.SumCajaDBin.text.toString().toDouble()
            } else {
                binding.SumCajaDBin.error = resources.getString(R.string.valor_requrido)
            }
            if (numA != null && numB != null && numC != null && numD != null) {
                val (real, imaginario) = Suma(numA,numB,numC,numD)
                var (real1, imaginario1)=MostrarPolar(real, imaginario)
                binding.textSolSumBin.text = getString(R.string.mostrarBino,real1,imaginario1)
            }else {
                Toast.makeText(this, getString(R.string.Ingrese_valores), Toast.LENGTH_LONG).show()
            }
        }

        binding.btnSumaTrigo.setOnClickListener {
            var modA: Double?=null
            var angA: Double?=null
            var modB: Double?=null
            var angB: Double?=null
            var real0: Double?=null
            var imaginario0: Double?=null
            var real1: Double?=null
            var imaginario1: Double?=null
            var real2: Double?=null
            var imaginario2: Double?=null
            if (binding.SumCajaM1Trigo.text.isNotEmpty()) {
                modA = binding.SumCajaM1Trigo.text.toString().toDouble()
            } else {
                binding.SumCajaM1Trigo.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.SumCajaAn1Trigo.text.isNotEmpty()) {
                angA = binding.SumCajaAn1Trigo.text.toString().toDouble()
            } else {
                binding.SumCajaAn1Trigo.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.SumCajaM2Trigo.text.isNotEmpty()) {
                modB = binding.SumCajaM2Trigo.text.toString().toDouble()
            } else {
                binding.SumCajaM2Trigo.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.SumCajaAn2Trigo.text.isNotEmpty()) {
                angB = binding.SumCajaAn2Trigo.text.toString().toDouble()
            } else {
                binding.SumCajaAn2Trigo.error = resources.getString(R.string.valor_requrido)
            }
            if (modA != null && angA != null && modB != null && angB != null) {
                var real1 = ConvModulReal(modA, angA)
                var imaginario1 = ConvModulImaginario(modA, angA)
                var real2 = ConvModulReal(modB, angB)
                var imaginario2 = ConvModulImaginario(modB, angB)
                var (real0, imaginario0) = Suma(real1,imaginario1,real2,imaginario2)
                val modulo = ConvBinoModulo(real0, imaginario0)
                val angulo = ConvBinoAngulo(real0, imaginario0)
                var (real11, imaginario11)=MostrarPolar(modulo, angulo)
                binding.textSolSumTrigo.text = getString(R.string.mostrarTrigo,real11,imaginario11)
            }else {
                Toast.makeText(this, getString(R.string.Ingrese_valores), Toast.LENGTH_LONG).show()
            }
        }
        binding.btnSumaPolar.setOnClickListener {
            var moduA: Double?=null
            var anguA: Double?=null
            var moduB: Double?=null
            var anguB: Double?=null
            var realu0: Double?=null
            var imaginariou0: Double?=null
            var realu1: Double?=null
            var imaginariou1: Double?=null
            var realu2: Double?=null
            var imaginariou2: Double?=null
            if (binding.SumCajaM1Polar.text.isNotEmpty()) {
                moduA = binding.SumCajaM1Polar.text.toString().toDouble()
            } else {
                binding.SumCajaM1Polar.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.SumCajaAn1Polar.text.isNotEmpty()) {
                anguA = binding.SumCajaAn1Polar.text.toString().toDouble()
            } else {
                binding.SumCajaAn1Polar.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.SumCajaM2Polar.text.isNotEmpty()) {
                moduB = binding.SumCajaM2Polar.text.toString().toDouble()
            } else {
                binding.SumCajaM2Polar.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.SumCajaAn2Polar.text.isNotEmpty()) {
                anguB = binding.SumCajaAn2Polar.text.toString().toDouble()
            } else {
                binding.SumCajaAn2Polar.error = resources.getString(R.string.valor_requrido)
            }
            if (moduA != null && anguA != null && moduB != null && anguB != null) {
                var realu1 = ConvModulReal(moduA, anguA)
                var imaginariou1 = ConvModulImaginario(moduA, anguA)
                var realu2 = ConvModulReal(moduB, anguB)
                var imaginariou2 = ConvModulImaginario(moduB, anguB)
                var (realu0, imaginariou0) = Suma(realu1,imaginariou1,realu2,imaginariou2)
                val modulop = ConvBinoModulo(realu0, imaginariou0)
                val angulop = ConvBinoAngulo(realu0, imaginariou0)
                var (real1, imaginario1)=MostrarPolar(modulop, angulop)
                binding.textSolSumPolar.text = getString(R.string.mostrarPolar,real1,imaginario1)

            }else{
                Toast.makeText(this, getString(R.string.Ingrese_valores), Toast.LENGTH_LONG).show()
            }
        }
    }
}