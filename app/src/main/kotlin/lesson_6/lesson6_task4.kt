package org.example.app.lesson_6

fun main() {
    var numberOfAttempts = 5
    val winnerNumber = (1..9).random()

    do {
        print("Введите число от 1 до 9: ")
        numberOfAttempts--
        val userNumber = readln().toInt()
    } while (userNumber != winnerNumber && numberOfAttempts != 0)

    if (numberOfAttempts == 0) println("Неверно")
    if (numberOfAttempts > 0) println("Это была великолепная игра")

    println("Было загадно число $winnerNumber")
}