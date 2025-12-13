package org.example.app.lesson_10

const val MIN_RANGE_DICE = 1
const val MAX_RANGE_DICE = 6

fun main() {
    var counter = 0
    game()
    if (game() == "Игрок выиграл") {
        counter++
    }

    println("Хотите бросить еще раз?")

    if (readln().replaceFirstChar { it.uppercaseChar() } == "Да") {
        do {
            if (game() == "Игрок выиграл") {
                counter++
            }
        } while (readln().replaceFirstChar { it.uppercaseChar() } == "Да")
    }

    println("Пользователь выиграл: $counter раз")
}

fun generateDiceNumber(): Int {
    return (MIN_RANGE_DICE..MAX_RANGE_DICE).random()
}

fun game(): String {
    val userNumber = generateDiceNumber()
    val botNumber = generateDiceNumber()

    if (userNumber > botNumber) {
        return "Игрок выиграл"
    }
    else {
        return "Игрок проиграл"
    }
}