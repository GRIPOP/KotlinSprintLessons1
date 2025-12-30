package org.example.app.lesson_15

fun main() {
    val temperature = Temperature(32.1f)
    val precipitationAmount = PrecipitationAmount(200)
    val infoWeather = WeatherServer()
    infoWeather.sendInfoWeather(temperature)
    infoWeather.sendInfoWeather(precipitationAmount)
}

abstract class WeatherStationStats

class Temperature(val temperature: Float) : WeatherStationStats()

class PrecipitationAmount(val precipitationAmount: Int) : WeatherStationStats()

class WeatherServer {
    fun sendInfoWeather(info: WeatherStationStats) {
        if (info is PrecipitationAmount) {
            println("Количество осадков: ${info.precipitationAmount}")
        } else if (info is Temperature) {
            println("Температура: ${info.temperature}")
        }
    }
}