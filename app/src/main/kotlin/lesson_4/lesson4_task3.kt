package org.example.app.lesson_4

const val REQUIRED_AIR_HUMIDITY = 20
const val BAD_WEATHER = "Зима"

fun main() {
    val weather = true
    val conditionTent = true
    val airHumidity: Int = 20
    val season: String = "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых?: ${weather && conditionTent && 
            airHumidity == REQUIRED_AIR_HUMIDITY && season != BAD_WEATHER}")
}