package org.example.app.lesson_3

fun main() {
    val firstMove = "D2-D4;0"

    val parseString = firstMove.split("-", ";")
    val firstSellMove = parseString[0]
    val secondSellMove = parseString[1]
    val numberMove = parseString[2]

    println(firstSellMove)
    println(secondSellMove)
    println(numberMove)
}