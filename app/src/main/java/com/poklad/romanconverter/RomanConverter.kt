package com.poklad.romanconverter

fun main() {
    println(RomanConverter().converterFromRomanToArabic("VI"))
    println(RomanConverter().converterFromRomanToArabic("VААI"))
}

class RomanConverter {
    fun converterFromRomanToArabic(str: String): Int {
        val romanValues = romanValue()

        var result = 0
        var prevValue = 0

        for (i in str.length - 1 downTo 0) {
            val currentSymbol = str[i]
            val currentValue = romanValues[currentSymbol]
                ?: throw IllegalArgumentException("Невірний символ в римському числі: $currentSymbol")
            if (currentValue < prevValue) {
                result -= currentValue
            } else {
                result += currentValue
            }

            prevValue = currentValue
        }
        return result
    }

    private fun romanValue(): Map<Char, Int> {
        return mapOf(
            'I' to 1, 'V' to 5, 'X' to 10, 'L' to 50,
            'C' to 100, 'D' to 500, 'M' to 1000
        )
    }
}