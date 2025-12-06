package org.example.app.lesson_6

const val CORRECT_LOGIN = "admin"
const val CORRECT_PASSWORD = "admin"

fun main() {
    print("Введите логин: ")
    var userLogin = readln()
    print("Ввведите пароль: ")
    var userPassword = readln()

    while (userLogin != CORRECT_LOGIN || userPassword != CORRECT_PASSWORD) {
        println("Введите логин и пароль заново")
        print("Введите логин: ")
        userLogin = readln()
        print("Ввведите пароль: ")
        userPassword = readln()
    }

    println("Авторизация прошла успешно")
}