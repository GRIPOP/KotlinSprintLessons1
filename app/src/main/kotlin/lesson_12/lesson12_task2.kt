package org.example.app.lesson_12

fun main() {
    val firstDay: WeatherForTheDay = WeatherForTheDay(30, 15, false)
    firstDay.printWeather()
}

class WeatherForTheDay(
    var dayTemperature: Int,
    var nightTemperature: Int,
    var isBadWeather: Boolean,
    ) {

    fun printWeather() {
        println("Погода днем: $dayTemperature")
        println("Погода ночью: $nightTemperature")
        println(isBadWeather)
    }
}