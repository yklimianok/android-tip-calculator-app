package com.example.tipcalculator

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat


class TipCalculatorTests {
    @Test
    fun calculateTip_25percentNoRoundup() {
        val amount = 10.00
        val tipPercent = 25.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2.5)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculateTip_27percentWithRoundUp() {
        val amount = 30.00
        val tipPercent = 27.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(9)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, true)
        assertEquals(expectedTip, actualTip)
    }
}
