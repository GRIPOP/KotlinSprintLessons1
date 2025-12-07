package org.example.app.lesson_6

const val CORRECT_LOGIN = "admin"
const val CORRECT_PASSWORD = "admin"

fun main() {
    var numberAttempts = 3
    do {
        val firstNumber = (1..9).random()
        val secondNumber = (1..9).random()
        print("Чему равно $firstNumber + $secondNumber = ")
        val userAnswer = readln().toInt()
        if (userAnswer == firstNumber + secondNumber) {
            println("Добро пожаловать!")
            break
        }
        numberAttempts--
        if (numberAttempts == 0) {
            println("Доступ запрещен")
        }
    } while (numberAttempts > 0)

    if (numberAttempts > 0) {
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
}



