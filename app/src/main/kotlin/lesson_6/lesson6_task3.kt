package org.example.app.lesson_6

fun main() {
    print("Введите количество секунд: ")
    var numbersOfSeconds = readln().toInt()

    while (numbersOfSeconds > 0) {
        println("Осталось секунд: ${numbersOfSeconds--}")
        Thread.sleep(1000)
    }

    println("Время вышло")
}