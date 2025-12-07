package org.example.app.lesson_6

fun main() {
    print("Введите количество секунд: ")
    val numbersOfSeconds = readln().toInt()
    Thread.sleep( numbersOfSeconds * 1000L)

    println("Прошло $numbersOfSeconds секунд")
}