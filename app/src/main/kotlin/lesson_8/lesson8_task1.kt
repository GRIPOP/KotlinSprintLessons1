package org.example.app.lesson_8

const val LEFT_RANGE = 10
const val RIGHT_RANGE = 100

fun main() {
    val numberOfViewsOnDay = intArrayOf((LEFT_RANGE..RIGHT_RANGE).random(),
        (LEFT_RANGE..RIGHT_RANGE).random(),
        (LEFT_RANGE..RIGHT_RANGE).random(),
        (LEFT_RANGE..RIGHT_RANGE).random(),
        (LEFT_RANGE..RIGHT_RANGE).random(),
        (LEFT_RANGE..RIGHT_RANGE).random(),
        (LEFT_RANGE..RIGHT_RANGE).random())

    println(numberOfViewsOnDay.sum())
}