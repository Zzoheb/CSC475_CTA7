package com.example.csc475_cta7

object ConversionUtils {

    fun metersToFeet(meters: Double): Double {
        return meters * 3.28084
    }

    fun feetToMeters(feet: Double): Double {
        return feet / 3.28084
    }
}
