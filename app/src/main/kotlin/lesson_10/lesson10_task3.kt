package org.example.app.lesson_10

const val LEFT_RANGE = 0
const val RIGHT_RANGE = 9

fun main() {
    print("Введите длину пароля: ")
    println(generatePassword(readln().toInt()))
}

fun generatePassword(lengthPassword: Int): String {
    var emptyPassword = ""
    val numbers = LEFT_RANGE..RIGHT_RANGE
    val specialSymbols = "!\"#\$%&'()*+,-./ ".split("")

    for (i in 1..lengthPassword) {
        emptyPassword += if (i % 2 != 0) {
            numbers.random()
        }
        else {
            specialSymbols.random()
        }
    }

    return emptyPassword
}