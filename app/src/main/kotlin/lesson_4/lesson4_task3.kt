package org.example.app.lesson_4

const val SUNNY_WEATHER = true
const val TENT_OPEN = true
const val REQUIRED_AIR_HUMIDITY = 20
const val BAD_WEATHER = "Зима"

fun main() {
    val isSunnyWeather = true
    val isTentOpen = true
    val airHumidity: Int = 20
    val season: String = "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых?: ${isSunnyWeather == SUNNY_WEATHER && 
            isTentOpen == TENT_OPEN &&
            airHumidity == REQUIRED_AIR_HUMIDITY &&
            season != BAD_WEATHER}")
}