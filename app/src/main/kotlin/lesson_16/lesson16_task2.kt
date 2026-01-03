package org.example.app.lesson_16

fun main() {
    val circle = Circle(1.5)

    println(circle.calculateLengthCircle())
    println(circle.calculateSquareCircle())
}

class Circle(private val radius: Double) {
    private val pi = 3.14

    fun calculateLengthCircle() = 2 * pi * radius

    fun calculateSquareCircle() = pi * radius * radius
}