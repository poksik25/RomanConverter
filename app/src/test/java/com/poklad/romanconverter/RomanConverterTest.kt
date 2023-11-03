package com.poklad.romanconverter

import org.junit.Assert.*
import org.junit.Test

class RomanConverterTest {
    @Test
    fun `convert to arabic`() {
        val converter = RomanConverter()
        assertEquals(converter.converterFromRomanToArabic("I"), 1)
        assertEquals(converter.converterFromRomanToArabic("II"), 2)
        assertEquals(converter.converterFromRomanToArabic("III"), 3)
        assertEquals(converter.converterFromRomanToArabic("V"), 5)
        assertEquals(converter.converterFromRomanToArabic("XX"), 20)
        assertEquals(converter.converterFromRomanToArabic("XIX"), 19)
    }
}