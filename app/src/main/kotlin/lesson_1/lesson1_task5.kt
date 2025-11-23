package org.example.app.lesson_1

fun main() {
    val secondsOfFlight: Short = 6480
    val hourOfFlight: Int = 6480 / 3600
    val minutesOfFlight: Int = (6480 / 60) - 60
    val seconds: Int = 6480 % 60
    println("Время полета 0$hourOfFlight:$minutesOfFlight:0$seconds;")
}