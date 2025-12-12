package org.example.app.lesson_10

const val MIN_CORRECT_LENGTH = 4

fun main() {
    print("Введите логин: ")
    val userLogin = readln()
    print("Введите пароль: ")
    val userPassword = readln()
    if (checkCorrectLogin(userLogin) && checkCorrectPassword(userPassword)) {
        println("Добро пожаловть!")
    }
    else {
        println("Логин или пароль недостаточно длинные")
    }
}

fun checkCorrectLogin(userLogin: String): Boolean {
    return (userLogin.length > MIN_CORRECT_LENGTH)
}

fun checkCorrectPassword(userPassword: String) : Boolean {
    return (userPassword.length > MIN_CORRECT_LENGTH)
}