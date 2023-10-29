package com.example.esasycomplex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.esasycomplex.databinding.ActivityRestaBinding

class Resta : AppCompatActivity() {
    private lateinit var binding:ActivityRestaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_resta)
        binding=ActivityRestaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnResBino.setOnClickListener {
            var numA: Double? = null
            var numB: Double? = null
            var numC: Double? = null
            var numD: Double? = null

            if (binding.ResCajaABin.text.isNotEmpty()) {
                numA = binding.ResCajaABin.text.toString().toDouble()
            } else {
                binding.ResCajaABin.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.ResCajaBBin.text.isNotEmpty()) {
                numB = binding.ResCajaBBin.text.toString().toDouble()
            } else {
                binding.ResCajaBBin.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.ResCajaCBin.text.isNotEmpty()) {
                numC = binding.ResCajaCBin.text.toString().toDouble()
            } else {
                binding.ResCajaCBin.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.ResCajaDBin.text.isNotEmpty()) {
                numD = binding.ResCajaDBin.text.toString().toDouble()
            } else {
                binding.ResCajaDBin.error = resources.getString(R.string.valor_requrido)
            }

            Toast.makeText(this, "Primero ingrese los valores faltantes", Toast.LENGTH_LONG).show()

            if (numA != null && numB != null && numC != null && numD != null) {
                val (real, imaginario) = Resta(numA, numB, numC, numD)
                var (real1, imaginario1)=MostrarPolar(real, imaginario)
                binding.textSolResBin.text = getString(R.string.mostrarBino,real1,imaginario1)
            } else {
                Toast.makeText(this, getString(R.string.Ingrese_valores), Toast.LENGTH_LONG).show()
            }
        }
        binding.btnResTrigo.setOnClickListener {
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
            if (binding.ResCajaM1Trigo.text.isNotEmpty()) {
                modA = binding.ResCajaM1Trigo.text.toString().toDouble()
            } else {
                binding.ResCajaM1Trigo.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.ResCajaAn1Trigo.text.isNotEmpty()) {
                angA = binding.ResCajaAn1Trigo.text.toString().toDouble()
            } else {
                binding.ResCajaAn1Trigo.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.ResCajaM2Trigo.text.isNotEmpty()) {
                modB = binding.ResCajaM2Trigo.text.toString().toDouble()
            } else {
                binding.ResCajaM2Trigo.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.ResCajaAn2Trigo.text.isNotEmpty()) {
                angB = binding.ResCajaAn2Trigo.text.toString().toDouble()
            } else {
                binding.ResCajaAn2Trigo.error = resources.getString(R.string.valor_requrido)
            }

            if (modA != null && angA != null && modB != null && angB != null) {
                var real1 = ConvModulReal(modA, angA)
                var imaginario1 = ConvModulImaginario(modA, angA)
                var real2 = ConvModulReal(modB, angB)
                var imaginario2 = ConvModulImaginario(modB, angB)
                var (real0, imaginario0) = Resta(real1,imaginario1,real2,imaginario2)
                val modulo = ConvBinoModulo(real0, imaginario0)
                val angulo = ConvBinoAngulo(real0, imaginario0)
                var (real11, imaginario11)=MostrarPolar(modulo, angulo)
                binding.textSolResTrigo.text = getString(R.string.mostrarTrigo,real11,imaginario11)
            }else {
                Toast.makeText(this, getString(R.string.Ingrese_valores), Toast.LENGTH_LONG).show()
            }
        }
        binding.btnResPolar.setOnClickListener {
            var moduA: Double? = null
            var anguA: Double? = null
            var moduB: Double? = null
            var anguB: Double? = null
            var realu0: Double? = null
            var imaginariou0: Double? = null
            var realu1: Double? = null
            var imaginariou1: Double? = null
            var realu2: Double? = null
            var imaginariou2: Double? = null
            if (binding.ResCajaM1Polar.text.isNotEmpty()) {
                moduA = binding.ResCajaM1Polar.text.toString().toDouble()
            } else {
                binding.ResCajaM1Polar.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.ResCajaAn1Polar.text.isNotEmpty()) {
                anguA = binding.ResCajaAn1Polar.text.toString().toDouble()
            } else {
                binding.ResCajaAn1Polar.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.ResCajaM2Polar.text.isNotEmpty()) {
                moduB = binding.ResCajaM2Polar.text.toString().toDouble()
            } else {
                binding.ResCajaM2Polar.error = resources.getString(R.string.valor_requrido)
            }

            if (binding.ResCajaAn2Polar.text.isNotEmpty()) {
                anguB = binding.ResCajaAn2Polar.text.toString().toDouble()
            } else {
                binding.ResCajaAn2Polar.error = resources.getString(R.string.valor_requrido)
            }

            if (moduA != null && anguA != null && moduB != null && anguB != null) {
                var realu1 = ConvModulReal(moduA, anguA)
                var imaginariou1 = ConvModulImaginario(moduA, anguA)
                var realu2 = ConvModulReal(moduB, anguB)
                var imaginariou2 = ConvModulImaginario(moduB, anguB)
                var (realu0, imaginariou0) = Resta(realu1, imaginariou1, realu2, imaginariou2)
                val modulop = ConvBinoModulo(realu0, imaginariou0)
                val angulop = ConvBinoAngulo(realu0, imaginariou0)
                var (real1, imaginario1)=MostrarPolar(modulop, angulop)
                binding.textSolResPolar.text = getString(R.string.mostrarPolar,real1,imaginario1)
            } else {
                Toast.makeText(this, getString(R.string.Ingrese_valores), Toast.LENGTH_LONG).show()
            }
        }
    }
}