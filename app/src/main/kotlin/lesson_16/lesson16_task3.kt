package org.example.app.lesson_16

fun main() {
    val user = User("User1", "123")

    print("Введите пароль: ")
    if (user.checkCorrectPassword()) {
        println("Пароль верный")
    } else {
        println("Пароль неверный")
    }
}

class User(val login: String, private val password: String) {

    fun checkCorrectPassword(passwordForCheck: String = readln()): Boolean {
        return passwordForCheck == password
    }
}