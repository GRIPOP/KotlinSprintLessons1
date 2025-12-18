package org.example.app.lesson_12

import kotlin.random.Random

const val MIN_TEMPERATURE_IN_MONTH = -30
const val MAX_TEMPERATURE_IN_MONTH = 30
const val NUMBER_DAYS_IN_MONTH = 30

fun main() {
    val daysWeather: MutableList<WeatherForTheDayV4> = mutableListOf()

    for (i in 1..NUMBER_DAYS_IN_MONTH) {
        daysWeather.add(WeatherForTheDayV4((MIN_TEMPERATURE_IN_MONTH..MAX_TEMPERATURE_IN_MONTH).random(), (MIN_TEMPERATURE_IN_MONTH..MAX_TEMPERATURE_IN_MONTH).random(), Random.nextBoolean()))
    }

    println("Средняя температура днем: ${daysWeather.map { it.dayTemperature }.sumOf {it} / NUMBER_DAYS_IN_MONTH}")
    println("Средняя температура ночью: ${daysWeather.map { it.nightTemperature }.sumOf { it } / NUMBER_DAYS_IN_MONTH}")
    println("Количество дней с осадками: ${daysWeather.filter { it.isBadWeather }.size}")
}

class WeatherForTheDayV4(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val isBadWeather: Boolean,
)