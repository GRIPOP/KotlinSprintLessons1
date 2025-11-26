package org.example.app.lesson_3

const val INCREASING_THE_MOVE_NUMBER = 1

fun main() {
    var sellNumberFirst = "E2"
    var sellNumberSecond = "E4"
    var moveNumber = 1

    println("$sellNumberFirst-$sellNumberSecond;$moveNumber")

    sellNumberFirst = "D2"
    sellNumberSecond = "D3"
    moveNumber += INCREASING_THE_MOVE_NUMBER

    println("$sellNumberFirst-$sellNumberSecond;$moveNumber")
}