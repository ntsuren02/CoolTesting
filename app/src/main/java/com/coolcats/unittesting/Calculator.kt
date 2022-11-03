package com.coolcats.unittesting

import kotlin.math.pow

class Calculator {

    fun addition(a: Int, b: Int) = a.toDouble() + b.toDouble()
    fun subtraction(a: Int, b: Int) = a.toDouble() - b.toDouble()
    fun division(a: Int, b: Int) = a.toDouble() / b.toDouble()
    fun multiplication(a: Int, b: Int) = a.toDouble() * b.toDouble()
    fun modulus(a: Int, b: Int) = a.toDouble() % b.toDouble()
    fun percentOf(a: Int, b: Int) = (a.toDouble()/100) * b.toDouble()
    fun exp(a: Int, b: Int) = a.toDouble().pow(b.toDouble())

}