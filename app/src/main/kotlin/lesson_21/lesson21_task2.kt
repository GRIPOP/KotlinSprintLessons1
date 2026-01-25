package org.example.app.lesson_21

fun main() {
    val numbers = listOf(1, 2, 3, 6, 10, 101, 200, 100)
    fun List<Int>.evenNumbersSum(number: (Int) -> Boolean): Int {
        var sum = 0

        for (i in this) {
            if (number(i)) sum += i
        }

        return sum
    }

    println(numbers.evenNumbersSum { it % 2 == 0 })
}