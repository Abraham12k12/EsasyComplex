package com.example.esasycomplex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.esasycomplex.databinding.ActivityMultiplicacionBinding

class Multiplicacion : AppCompatActivity() {
    private lateinit var binding:ActivityMultiplicacionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_multiplicacion)
        binding=ActivityMultiplicacionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMulBino.setOnClickListener {
            var numA: Double?=null
            var numB: Double?=null
            var numC: Double?=null
            var numD: Double?=null

            if (binding.MulCajaABin.text.isNotEmpty()) {
                numA = binding.MulCajaABin.text.toString().toDouble()
            } else {
                binding.MulCajaABin.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.MulCajaBBin.text.isNotEmpty()) {
                numB = binding.MulCajaBBin.text.toString().toDouble()
            } else {
                binding.MulCajaBBin.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.MulCajaCBin.text.isNotEmpty()) {
                numC = binding.MulCajaCBin.text.toString().toDouble()
            } else {
                binding.MulCajaCBin.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.MulCajaDBin.text.isNotEmpty()) {
                numD = binding.MulCajaDBin.text.toString().toDouble()
            } else {
                binding.MulCajaDBin.error = resources.getString(R.string.valor_requrido)
            }
            if (numA != null && numB != null && numC != null && numD != null) {
                val (real, imaginario) = MultiBino(numA,numB,numC,numD)
                var (real1, imaginario1)= MostrarBino(real, imaginario)
                binding.textSolMulBin.text = getString(R.string.mostrarPolar,real1,imaginario1)
            }else {
                Toast.makeText(this, getString(R.string.Ingrese_valores), Toast.LENGTH_LONG).show()
            }
        }

        binding.btnMulTrigo.setOnClickListener {
            var modA: Double?=null
            var angA: Double?=null
            var modB: Double?=null
            var angB: Double?=null
            if (binding.MulCajaM1Trigo.text.isNotEmpty()) {
                modA = binding.MulCajaM1Trigo.text.toString().toDouble()
            } else {
                binding.MulCajaM1Trigo.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.MulCajaAn1Trigo.text.isNotEmpty()) {
                angA = binding.MulCajaAn1Trigo.text.toString().toDouble()
            } else {
                binding.MulCajaAn1Trigo.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.MulCajaM2Trigo.text.isNotEmpty()) {
                modB = binding.MulCajaM2Trigo.text.toString().toDouble()
            } else {
                binding.MulCajaM2Trigo.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.MulCajaAn2Trigo.text.isNotEmpty()) {
                angB = binding.MulCajaAn2Trigo.text.toString().toDouble()
            } else {
                binding.MulCajaAn2Trigo.error = resources.getString(R.string.valor_requrido)
            }
            if (modA != null && angA != null && modB != null && angB != null) {
                var (modulo, angulo) = MultiTrigoPol(modA,angA,modB, angB)
                var (real1, imaginario1)= MostrarTrigo(modulo, angulo)
                binding.textSolMulResrigo.text = getString(R.string.mostrarTrigo,real1,imaginario1)
            }else {
                Toast.makeText(this, getString(R.string.Ingrese_valores), Toast.LENGTH_LONG).show()
            }
        }
        binding.btnMulPolar.setOnClickListener {
            var moduA: Double?=null
            var anguA: Double?=null
            var moduB: Double?=null
            var anguB: Double?=null
            if (binding.MulCajaM1Polar.text.isNotEmpty()) {
                moduA = binding.MulCajaM1Polar.text.toString().toDouble()
            } else {
                binding.MulCajaM1Polar.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.MulCajaAn1Polar.text.isNotEmpty()) {
                anguA = binding.MulCajaAn1Polar.text.toString().toDouble()
            } else {
                binding.MulCajaAn1Polar.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.MulCajaM2Polar.text.isNotEmpty()) {
                moduB = binding.MulCajaM2Polar.text.toString().toDouble()
            } else {
                binding.MulCajaM2Polar.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.MulCajaAn2Polar.text.isNotEmpty()) {
                anguB = binding.MulCajaAn2Polar.text.toString().toDouble()
            } else {
                binding.MulCajaAn2Polar.error = resources.getString(R.string.valor_requrido)
            }
            if (moduA != null && anguA != null && moduB != null && anguB != null) {
                var (modulo, angulo) = MultiTrigoPol(moduA,anguA,moduB, anguB)
                var (real1, imaginario1)=MostrarPolar(modulo, angulo)
                binding.textSolMulPolar.text = getString(R.string.mostrarPolar,real1,imaginario1)
            }else {
                Toast.makeText(this, getString(R.string.Ingrese_valores), Toast.LENGTH_LONG).show()
            }
        }
    }
}