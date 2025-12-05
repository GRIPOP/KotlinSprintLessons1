package org.example.app.lesson_6

fun main() {
    print("Введите количество секунд: ")
    var numbersOfSeconds = readln().toInt()
    val userTime = numbersOfSeconds

    do {
        numbersOfSeconds--
        Thread.sleep(1000)
    } while (numbersOfSeconds > 0)

    println("Прошло $userTime секунд")
}