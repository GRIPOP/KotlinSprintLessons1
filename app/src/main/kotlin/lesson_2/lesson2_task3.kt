package org.example.app.lesson_2
const val SECONDS_IN_MINUTE = 60

fun main() {
    val departureTimeHour = 9
    val departureTimeMinutes  = 29
    val travelTimeInMinutes = 457

    val departureTimeInMinutes = departureTimeHour * SECONDS_IN_MINUTE + departureTimeMinutes
    val arrivalTime = departureTimeInMinutes + travelTimeInMinutes
    val hourArrivalTime = arrivalTime / SECONDS_IN_MINUTE
    val minutesArrivalTime = arrivalTime % SECONDS_IN_MINUTE

    println(String.format("%02d:%02d", hourArrivalTime, minutesArrivalTime))
}