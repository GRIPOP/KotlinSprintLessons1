package org.example.app.lesson_12

const val CONVERSION_TO_KELVINS = 273

fun main() {
    val firstDay: WeatherForTheDayV3 = WeatherForTheDayV3(300, 285, false)
}

class WeatherForTheDayV3(
    _dayTemperature: Int,
    _nightTemperature: Int,
    _isBadWeather: Boolean,
) {
    val dayTemperature: Int = _dayTemperature - CONVERSION_TO_KELVINS
    val nightTemperature: Int = _nightTemperature - CONVERSION_TO_KELVINS
    val isBadWeather = _isBadWeather

    init {
        println("Погода днем: $dayTemperature°C")
        println("Погода ночью: $nightTemperature°C")
        println(isBadWeather)
    }
}