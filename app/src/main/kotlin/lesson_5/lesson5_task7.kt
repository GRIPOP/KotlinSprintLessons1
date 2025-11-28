package org.example.app.lesson_5

import java.util.Locale

const val KOEF_LITER_FUEL_FOR_ONE_KM = 100

fun main() {
    print("Введите длину пути: ")
    val lengthWay = readln().toFloat()
    print("Введите расход топлива на 100км: ")
    val fuelConsumptionOn100km = readln().toFloat()
    print("Введите цену за топливо: ")
    val priceFuel = readln().toFloat()

    val consumptionFuelOnWay = (lengthWay * fuelConsumptionOn100km) / KOEF_LITER_FUEL_FOR_ONE_KM
    val priceForAllFuel = consumptionFuelOnWay * priceFuel

    println(consumptionFuelOnWay)
    println(String.format(Locale.US, "%.2f", priceForAllFuel))
}