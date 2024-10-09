package com.example.csc475_cta7

import org.junit.Assert.assertEquals
import org.junit.Test

class ConversionUtilsTest {

    @Test
    fun testMetersToFeet() {
        val result = ConversionUtils.metersToFeet(1.0)
        assertEquals(3.28084, result, 0.01)
    }

    @Test
    fun testFeetToMeters() {
        val result = ConversionUtils.feetToMeters(3.28084)
        assertEquals(1.0, result, 0.01)
    }
}
