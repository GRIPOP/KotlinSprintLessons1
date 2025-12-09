package org.example.app.lesson_7

const val LENGTH_PASSWORD = 6

fun main() {
    val number = 1..9
    val letter = 'a'..'z'

    for (i in 1..LENGTH_PASSWORD) {
        if (i % 2 != 0) {
            print(number.random())
        } else {
            print(letter.random())
        }
    }
}