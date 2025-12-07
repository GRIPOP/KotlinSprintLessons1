package org.example.app.lesson_7

const val LENGTH_AUTHORIZATION_CODE = 4

fun main() {
    do {
        var authorizationCode = ""
        for (i in 1..LENGTH_AUTHORIZATION_CODE) {
            authorizationCode += (1..9).random()
        }
        println("Ваш код авторизации: $authorizationCode")
        print("Введите код активации: ")
    } while (readln() != authorizationCode)

    println("Добро пожаловать!")
}