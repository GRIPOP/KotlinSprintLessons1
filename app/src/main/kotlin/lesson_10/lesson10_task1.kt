package org.example.app.lesson_10

const val LEFT_RANGE_NUMBER = 1
const val RIGHT_RANGE_NUMBER = 6

fun main() {
    print("Игрок бросает кубик и выпадает: ")
    val numberPlayer = generateRandomNumber()
    println(numberPlayer)

    print("Компьютер бросает кубик и выпадает: ")
    val numberBot = generateRandomNumber()
    println(numberBot)

    when {
        numberPlayer > numberBot -> println("Победило человечество")
        numberPlayer < numberBot -> println("Победила машина")
        else -> println("Победила дружба")
    }
}

fun generateRandomNumber(): Int {
    return (LEFT_RANGE_NUMBER..RIGHT_RANGE_NUMBER).random()
}