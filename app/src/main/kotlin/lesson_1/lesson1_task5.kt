package org.example.app.lesson_1
const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60

fun main() {
    val secondsOfFlight: Short = 6480

    val hours: Int = secondsOfFlight / SECONDS_IN_HOUR
    val minutes: Int = secondsOfFlight / SECONDS_IN_MINUTE % SECONDS_IN_MINUTE
    val seconds: Int = secondsOfFlight % SECONDS_IN_MINUTE
    val arrivalTime = "%02d:%02d:%02d".format(hours, minutes, seconds)

    println(arrivalTime)
}