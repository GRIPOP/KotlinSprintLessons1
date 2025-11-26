package org.example.app.lesson_5

fun main() {
    val number1 = 5
    val number2 = 5
    println("Сколько будет $number1 + $number2")
    val userNumber = readln().toInt()

    if (userNumber == number1 + number2) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}