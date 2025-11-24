package org.example.app.lesson_2

const val MINUTE_IN_HOUR = 60

fun main() {
    val departureTimeHour = 9
    val departureTimeMinutes = 39
    val travelTimeInMinutes = 457

    val departureTimeInMinutes = departureTimeHour * MINUTE_IN_HOUR + departureTimeMinutes
    val arrivalTime = departureTimeInMinutes + travelTimeInMinutes
    val hourArrivalTime = arrivalTime / MINUTE_IN_HOUR
    val minutesArrivalTime = arrivalTime % MINUTE_IN_HOUR

    println(String.format("%02d:%02d", hourArrivalTime, minutesArrivalTime))
}