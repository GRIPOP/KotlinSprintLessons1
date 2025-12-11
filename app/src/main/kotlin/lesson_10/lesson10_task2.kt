package org.example.app.lesson_10

const val MIN_CORRECT_LENGTH = 4

fun main() {
    checkCorrectLoginAndPassword(readln(), readln())
}

fun checkCorrectLoginAndPassword(userLogin: String, userPassword: String) {
    if (userLogin.length < MIN_CORRECT_LENGTH || userPassword.length < MIN_CORRECT_LENGTH ) {
        println("Логин или пароль недостаточно длинные")
    }
    else {
        println("Добро пожаловать!")
    }
}