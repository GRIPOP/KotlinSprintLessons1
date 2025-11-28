package org.example.app.lesson_5

fun main() {
    val winNumber = listOf((0..42).random(), (0..42).random(), (0..42).random())
    println("Введите 3 числа: ")
    val userNumber = listOf(readln().toInt(), readln().toInt(), readln().toInt())

    val userWinNumber = winNumber.intersect(userNumber)
    when (userWinNumber.size) {
        0 -> println("Не угадано ни одного числа")
        1 -> println("Угадано 1 число. Вы выйграли утешительный приз ")
        2 -> println("Угадано 2 числа. Вы выйграли крупный приз!")
        3 -> println("Угаданы все числа! Джекпот!")
    }
    println("Выигрышные числа: $winNumber")
}