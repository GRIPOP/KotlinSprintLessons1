package org.example.app.lesson_2

fun main() {
    val departureTimeHour: Short = 9
    val departureTimeMinutes: Short = 29
    val travelTimeInMinutes: Short = 457
    val departureTimeInMinutes: Int = departureTimeHour * 60 + departureTimeMinutes
    val arrivalTime: Int = departureTimeInMinutes + travelTimeInMinutes
    val hourArrivalTime: Int = arrivalTime / 60
    val minutesArrivalTime: Int = arrivalTime % 60
    println(String.format("%d:%02d", hourArrivalTime, minutesArrivalTime))
}