package org.example.app.lesson_7

const val LENGTH_PASSWORD = 6

fun main() {
    for (i in 1..LENGTH_PASSWORD) {
        if (i % 2 != 0){ print((1..9).random()) }
        else {print(('a'..'z').random())}
    }
}