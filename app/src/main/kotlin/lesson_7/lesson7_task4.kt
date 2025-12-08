package org.example.app.lesson_7

fun main() {
    print("Введите количество секунд: ")
    val numberOfSeconds = readln().toInt()

    for (i in numberOfSeconds downTo 0) {
        println(i)
        Thread.sleep(1000)
    }

    println("Время вышло")
}