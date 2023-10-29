package com.example.esasycomplex

import kotlin.math.sqrt
import kotlin.math.pow
import kotlin.math.atan
import kotlin.math.cos
import kotlin.math.sin
fun ConvBinoModulo(Real: Double,Imagi: Double): Double {
    val Modulo =sqrt(Math.pow(Real,2.0)+Math.pow(Imagi, 2.0))
    return Modulo
}
fun ConvBinoAngulo(Real: Double, Imagi: Double): Double{
    val Angulo=atan(Imagi/Real)
    return Angulo
}
fun ConvModulReal(Modulo:Double, Angulo:Double):Double{
    val Real=Modulo*cos(Angulo)
    return Real
}
fun ConvModulImaginario(Modulo:Double, Angulo:Double):Double{
    val Imaginario=Modulo*sin(Angulo)
    return Imaginario
}
fun Suma(numA:Double,numB:Double,numC:Double,numD:Double): Pair<Double, Double>{
    val Real=numA+numC
    val Imaginario=numB+numD
    return Pair(Real, Imaginario)
}
fun Resta(numA:Double,numB:Double,numC:Double,numD:Double): Pair<Double, Double>{
    val Real=numA-numC
    val Imaginario=numB-numD
    return Pair(Real,Imaginario)
}
fun MultiBino(numA:Double,numB:Double,numC:Double,numD:Double): Pair<Double, Double>{
    val Real=(numA*numC)-(numB*numD)
    val Imaginario=(numA*numD)+(numB*numC)
    return Pair(Real,Imaginario)
}
fun DiviBino(numA:Double,numB:Double,numC:Double,numD:Double): Pair<Double, Double>{
    val Real=((numA*numC)+(numB*numD))/(numC.pow(2.0)+numD.pow(2.0))
    val Imaginario=((numB*numC)-(numA*numD))/(numC.pow(2.0)+numD.pow(2.0))
    return Pair(Real,Imaginario)
}

fun MultiTrigoPol(ModuA:Double,AngA:Double,ModuB:Double,AngD:Double): Pair<Double, Double>{
    val Modulo=ModuA*ModuB
    val Angulo=AngA+AngD
    return Pair(Modulo,Angulo)
}
fun DiviTrigoPol(ModuA:Double,AngA:Double,ModuB:Double,AngB:Double): Pair<Double, Double>{
    val Modulo=ModuA/ModuB
    val Angulo=AngA-AngB
    return Pair(Modulo,Angulo)
}
fun MostrarBino(RealA:Double, ImaginarioB:Double): Pair<String,String>{
    val Realformat=String.format("%.4f", RealA)
    val Imaginformat=String.format("%.4f", ImaginarioB)
    val Texto: String="$Realformat+j$Imaginformat"
    //val Texto = resources.getString(R.string.mostrarBino,Realformat,Imaginformat)
    return Pair(Realformat, Imaginformat)
}
fun MostrarTrigo(ModuloR:Double,Angulo0:Double): Pair<String,String>{
    val Moduloformat=String.format("%.4f", ModuloR)
    val Anguloformat=String.format("%.4f", Angulo0)
    //val Texto: String="$Moduloformat CIS($Anguloformat)"
    return Pair(Moduloformat, Anguloformat)
}
fun MostrarPolar(ModuloR:Double, Angulo0:Double): Pair<String,String>{
    val Moduloformat=String.format("%.4f", ModuloR)
    val Anguloformat=String.format("%.4f", Angulo0)
    //val Texto: String="$Moduloformat e^j($Anguloformat)"
    return Pair(Moduloformat, Anguloformat)
}