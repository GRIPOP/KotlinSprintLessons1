package org.example.app.lesson_21

fun main() {
    val numbers = listOf(1, 2, 3, 6, 10, 101, 200, 100)

    println(numbers.evenNumbersSum())
}

fun List<Int>.evenNumbersSum() = this.filter { it % 2 == 0 }.sum()