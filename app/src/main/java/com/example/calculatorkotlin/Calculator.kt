package com.example.calculatorkotlin

class Calculator {

    fun add(firstValue: Double,secondValue: Double):Double{
        return firstValue+secondValue;
    }
    fun minus(firstValue: Double,secondValue: Double):Double{
        return firstValue-secondValue;
    }
    fun multi(firstValue: Double,secondValue: Double):Double{
        return firstValue*secondValue;
    }
    fun div(firstValue: Double,secondValue: Double):Double{
        return firstValue/secondValue;
    }
    fun mod(firstValue: Double,secondValue: Double):Double{
        return firstValue%secondValue;
    }

}