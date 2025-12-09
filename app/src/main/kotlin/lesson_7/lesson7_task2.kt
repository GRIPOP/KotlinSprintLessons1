package org.example.app.lesson_7

fun main() {
    do {
        val authorizationCode = (1000..9000).random()
        println("Ваш код авторизации: $authorizationCode")
        print("Введите код активации: ")
    } while (readln().toInt() != authorizationCode)

    println("Добро пожаловать!")
}