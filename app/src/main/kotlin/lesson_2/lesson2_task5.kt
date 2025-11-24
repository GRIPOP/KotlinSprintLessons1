package org.example.app.lesson_2

import java.util.Locale
import kotlin.math.pow

fun main() {
    val initialInvestmentAmount = 70_000
    val interestRate = 16.7
    val depositPeriod = 20
    val theNumberOfChargesPerYear = 1

    val interestRateInDecimalNumber = interestRate / 100
    val finalSum = initialInvestmentAmount * (1 + interestRateInDecimalNumber /
            theNumberOfChargesPerYear).pow(theNumberOfChargesPerYear * depositPeriod)

    println(String.format(Locale.US, "%.3f", finalSum))
}