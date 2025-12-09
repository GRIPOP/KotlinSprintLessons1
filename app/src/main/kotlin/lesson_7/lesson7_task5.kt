package org.example.app.lesson_7

const val MIN_LENGTH_PASSWORD = 6

fun main() {
    print("Введите длину пароля: ")
    val userLength = readln().toInt()
    val numbers = (1..9)
    val lowerLetter = ('a'..'z')
    val upperLetter = ('A'..'Z')
    val totalList = numbers + lowerLetter + upperLetter
    var password = numbers.random().toString() + lowerLetter.random() + upperLetter.random()

    if (userLength >= 6) {
        for (i in 1..(userLength - 3)) {
            password += totalList.random()
        }
    }
    else {
        println("Длина пароля меньше $MIN_LENGTH_PASSWORD")
    }

    println(password)
}
