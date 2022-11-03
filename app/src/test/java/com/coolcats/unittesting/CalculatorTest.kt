package com.coolcats.unittesting

import org.junit.After
import org.junit.Before

import org.junit.Assert.*
import org.junit.Test

class CalculatorTest {

    private var calculator: Calculator? = null
    @Before
    fun setUp() {
        calculator = Calculator()
    }

    @Test
    fun `test code to make sure addition works`(){

        assertEquals(10.0, calculator?.addition(7,3))
        assertEquals(19.0, calculator?.addition(7,12))
    }

    @Test
    fun `test code to make sure subtraction works`(){

        assertEquals(4.0, calculator?.subtraction(7,3))
        assertEquals(5.0, calculator?.subtraction(12,7))
    }

    @Test
    fun testMultiplication(){

        assertEquals(20.0, calculator?.multiplication(5,4))
    }

    @Test
    fun testDivision(){

        assertEquals(5.0, calculator?.division(30,6))
    }

    @Test
    fun testModulus(){

        assertEquals(1.0, calculator?.modulus(5,2))
        assertEquals(0.0, calculator?.modulus(9,3))
    }

    @Test
    fun testPercentOf(){

        assertEquals(3.0, calculator?.percentOf(75,4))
        assertEquals(3.0, calculator?.percentOf(60,5))
    }

    @Test
    fun testExp(){

        assertEquals(81.0, calculator?.exp(3,4))
        assertEquals(25.0, calculator?.exp(5,2))
    }

    @After
    fun tearDown() {
        calculator = null
    }
}