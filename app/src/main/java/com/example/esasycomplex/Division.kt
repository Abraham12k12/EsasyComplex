package com.example.esasycomplex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.esasycomplex.databinding.ActivityDivisionBinding

class Division : AppCompatActivity() {
    private lateinit var binding:ActivityDivisionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_division)
        binding=ActivityDivisionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDivBino.setOnClickListener {
            var numA: Double?=null
            var numB: Double?=null
            var numC: Double?=null
            var numD: Double?=null

            if (binding.DivCajaABin.text.isNotEmpty()) {
                numA = binding.DivCajaABin.text.toString().toDouble()
            } else {
                binding.DivCajaABin.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.DivCajaBBin.text.isNotEmpty()) {
                numB = binding.DivCajaBBin.text.toString().toDouble()
            } else {
                binding.DivCajaBBin.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.DivCajaCBin.text.isNotEmpty()) {
                numC = binding.DivCajaCBin.text.toString().toDouble()
            } else {
                binding.DivCajaCBin.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.DivCajaDBin.text.isNotEmpty()) {
                numD = binding.DivCajaDBin.text.toString().toDouble()
            } else {
                binding.DivCajaDBin.error = resources.getString(R.string.valor_requrido)
            }
            if (numA != null && numB != null && numC != null && numD != null) {
                var (real, imaginario) = DiviBino(numA,numB,numC,numD)
                var (real1, imaginario1)=MostrarBino(real, imaginario)
                binding.textSolDivBin.text = getString(R.string.mostrarBino,real1,imaginario1)
            }else {
                Toast.makeText(this, getString(R.string.Ingrese_valores), Toast.LENGTH_LONG).show()
            }
        }

        binding.btnDivTrigo.setOnClickListener {
            var modA: Double?=null
            var angA: Double?=null
            var modB: Double?=null
            var angB: Double?=null
            if (binding.DivCajaM1Trigo.text.isNotEmpty()) {
                modA = binding.DivCajaM1Trigo.text.toString().toDouble()
            } else {
                binding.DivCajaM1Trigo.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.DivCajaAn1Trigo.text.isNotEmpty()) {
                angA = binding.DivCajaAn1Trigo.text.toString().toDouble()
            } else {
                binding.DivCajaAn1Trigo.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.DivCajaM2Trigo.text.isNotEmpty()) {
                modB = binding.DivCajaM2Trigo.text.toString().toDouble()
            } else {
                binding.DivCajaM2Trigo.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.DivCajaAn2Trigo.text.isNotEmpty()) {
                angB = binding.DivCajaAn2Trigo.text.toString().toDouble()
            } else {
                binding.DivCajaAn2Trigo.error = resources.getString(R.string.valor_requrido)
            }
            if (modA != null && angA != null && modB != null && angB != null) {
                var (modulo, angulo) = DiviTrigoPol(modA,angA,modB, angB)
                var (real1, imaginario1)=MostrarTrigo(modulo, angulo)
                binding.textSolDivTrigo.text = getString(R.string.mostrarTrigo,real1,imaginario1)
            }else {
                Toast.makeText(this, getString(R.string.Ingrese_valores), Toast.LENGTH_LONG).show()
            }
        }
        binding.btnDivPolar.setOnClickListener {
            var moduA: Double?=null
            var anguA: Double?=null
            var moduB: Double?=null
            var anguB: Double?=null
            if (binding.DivCajaM1Polar.text.isNotEmpty()) {
                moduA = binding.DivCajaM1Polar.text.toString().toDouble()
            } else {
                binding.DivCajaM1Polar.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.DivCajaAn1Polar.text.isNotEmpty()) {
                anguA = binding.DivCajaAn1Polar.text.toString().toDouble()
            } else {
                binding.DivCajaAn1Polar.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.DivCajaM2Polar.text.isNotEmpty()) {
                moduB = binding.DivCajaM2Polar.text.toString().toDouble()
            } else {
                binding.DivCajaM2Polar.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.DivCajaAn2Polar.text.isNotEmpty()) {
                anguB = binding.DivCajaAn2Polar.text.toString().toDouble()
            } else {
                binding.DivCajaAn2Polar.error = resources.getString(R.string.valor_requrido)
            }
            if (moduA != null && anguA != null && moduB != null && anguB != null) {
                var (modulo, angulo) = DiviTrigoPol(moduA,anguA,moduB, anguB)
                var (real1, imaginario1)=MostrarPolar(modulo, angulo)
                binding.textSolDivPolar.text = getString(R.string.mostrarPolar,real1,imaginario1)
            }else {
                Toast.makeText(this, getString(R.string.Ingrese_valores), Toast.LENGTH_LONG).show()
            }
        }
    }
}