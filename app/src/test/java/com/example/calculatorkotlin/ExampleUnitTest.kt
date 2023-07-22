package com.example.calculatorkotlin

import androidx.test.filters.SmallTest
import org.hamcrest.core.Is
import org.hamcrest.core.IsEqual
import org.hamcrest.number.IsCloseTo
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(JUnit4::class)
@SmallTest
class ExampleUnitTest {
    var myCalculator:Calculator?=null
    @Before
    fun setUp(){
         myCalculator=Calculator()
    }
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun addTwoPositiveNumbers() {
        var result: Double = myCalculator!!.add(1.0, 1.0)
        assertEquals(result,2.0,0.0)
    }

    @Test
    fun addTwoNumbersPositiveAndNegative() {
        val result: Double = myCalculator!!.add(-1.0, 2.0)
        assertEquals(result,1.0,0.0)
    }

    @Test
    fun addTwoNegativeNumbers() {
        val result: Double = myCalculator!!.add(-1.0, -1.0)
        assertEquals(result,-2.0,0.0)
    }

    @Test
    fun addTwoFloatNumbers() {
        val result: Double = myCalculator!!.add(1.11, 1.11)
        assertEquals(result,2.22,0.0)
    }

    @Test
    fun subTwoPositiveNumbers() {
        val result: Double = myCalculator!!.minus(2.0, 1.0)
        assertEquals(result,1.0,0.0)
    }

    @Test
    fun subTwoNumbersPositiveAndNegative() {
        val result: Double = myCalculator!!.minus(-1.0, 2.0)
        assertEquals(result,-3.0,0.0)
    }

    @Test
    fun subTwoNegativeNumbers() {
        val result: Double = myCalculator!!.minus(-2.0, -1.0)
        assertEquals(result,-1.0,0.0)
    }

    @Test
    fun subTwoFloatNumbers() {
        val result: Double = myCalculator!!.minus(2.22, 1.11)
        assertEquals(result,1.11,0.0)
    }

    @Test
    fun multiTwoPositiveNumbers() {
        val result: Double = myCalculator!!.multi(1.0, 1.0)
        assertEquals(result,1.0,0.0)
    }

    @Test
    fun multiTwoNumbersPositiveAndNegative() {
        val result: Double = myCalculator!!.multi(-1.0, 2.0)
        assertEquals(result,-2.0,0.0)
    }

    @Test
    fun multiTwoNegativeNumbers() {
        val result: Double = myCalculator!!.multi(-1.0, -1.0)
        assertEquals(result,1.0,0.0)
    }

    @Test
    fun multiTwoFloatNumbers() {
        val result: Double = myCalculator!!.multi(1.11, 1.11)
        assertEquals(result,1.23,.01)
    }

    @Test
    fun divTwoPositiveNumbers() {
        val result: Double = myCalculator!!.div(2.0, 1.0)
        assertEquals(result,2.0,0.0)
    }

    @Test
    fun divTwoNumbersPositiveAndNegative() {
        val result: Double = myCalculator!!.div(-1.0, 2.0)
        assertEquals(result,-0.5,0.0)
    }

    @Test
    fun divTwoNegativeNumbers() {
        val result: Double = myCalculator!!.div(-1.0, -1.0)
        assertEquals(result,1.0,0.0)
    }

    @Test
    fun divTwoFloatNumbers() {
        val result: Double = myCalculator!!.div(1.11, 1.11)
        assertEquals(result,1.0,0.0)
    }

    @Test
    fun modTwoPositiveNumbers() {
        val result: Double = myCalculator!!.mod(4.0, 3.0)
        assertEquals(result,1.0,0.0)
    }

    @Test
    fun modTwoNumbersPositiveAndNegative() {
        val result: Double = myCalculator!!.mod(-4.0, 3.0)
        assertEquals(result,-1.0,0.0)
    }

    @Test
    fun modTwoNegativeNumbers() {
        val result: Double = myCalculator!!.mod(-4.0, -3.0)
        assertEquals(result,-1.0,0.0)
    }

    @Test
    fun modTwoFloatNumbers() {
        val result: Double = myCalculator!!.mod(1.11, 1.11)
        assertEquals(result,0.1,0.1)}

}