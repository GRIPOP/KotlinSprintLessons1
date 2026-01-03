package org.example.app.lesson_16

fun main() {
    val user = User("User1", "123")

    print("Введите пароль: ")
    user.checkCorrectPassword()
}

class User(val login: String, private val password: String) {

    fun checkCorrectPassword(passwordForCheck: String = readln()) {
        when {
            passwordForCheck == password -> println("Пароль верный")
            else -> println("Введен неверный пароль")
        }
    }
}