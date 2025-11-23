package org.example.app.lesson_1

fun main() {
    val secondsOfFlight: Short = 6480
    val hours: Int = secondsOfFlight / 3600
    val minutes: Int = secondsOfFlight / 60 % 60
    val seconds: Int = secondsOfFlight % 60
    val arrivalTime = String.format("%02d:%02d:%02d" , hours, minutes, seconds)
    println(arrivalTime)


}