package org.example.app.lesson_12

const val CONVERSION_TO_KELVINS_CELSIUS = 273

fun main() {

    val firstDay: WeatherForTheDayV2 = WeatherForTheDayV2(300, 285, false)
    firstDay.printWeather()
}

class WeatherForTheDayV2(
    _dayTemperature: Int,
    _nightTemperature: Int,
    _isBadWeather: Boolean,
) {
    val dayTemperature: Int = _dayTemperature - CONVERSION_TO_KELVINS_CELSIUS
    val nightTemperature: Int = _nightTemperature - CONVERSION_TO_KELVINS_CELSIUS
    val isBadWeather = _isBadWeather

    fun printWeather() {
        println("Погода днем: $dayTemperature")
        println("Погода ночью: $nightTemperature")
        println(isBadWeather)
    }
}