package org.example.app.lesson_12

fun main() {
    val firstDay: Weather = Weather()
    firstDay.dayTemperature = 30
    firstDay.nightTemperature = 16
    firstDay.isBadWeather = false
    firstDay.printWeather()

    val secondDay: Weather = Weather()
    secondDay.dayTemperature = -20
    secondDay.nightTemperature = -32
    secondDay.isBadWeather = true
    secondDay.printWeather()
}

class Weather() {
    var dayTemperature: Int = 0
    var nightTemperature: Int = 0
    var isBadWeather: Boolean = true

    fun printWeather() {
        println("Погода днем: $dayTemperature")
        println("Погода ночью: $nightTemperature")
        println(isBadWeather)
    }
}