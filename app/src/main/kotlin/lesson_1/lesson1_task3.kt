package org.example.app.lesson_1

fun main() {
    val year: Int = 1961
    var hour: Int = 9
    var minutes: Int = 7
    println(year)
    println(String.format("%02d", hour))
    println(String.format("%02d", minutes))
    hour = 10
    minutes = 55
    println(String.format("%d:%02d", hour, minutes))
}