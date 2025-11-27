package org.example.app.lesson_5

const val AGE_OF_MAJORITY = 18
const val YEAR = 2025

fun main() {
    val userYearOfBirth = readln().toInt()

    if (YEAR - userYearOfBirth >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Вернуться на основной экран")
}