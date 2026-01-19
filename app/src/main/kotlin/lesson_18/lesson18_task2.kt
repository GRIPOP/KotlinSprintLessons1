package org.example.app.lesson_18

const val NUMBER_OF_SIDES_OF_THE_FIRST_DICE = 4
const val NUMBER_OF_SIDES_OF_THE_SECOND_DICE = 6
const val NUMBER_OF_SIDES_OF_THE_THIRD_DICE = 8

fun main() {
    val dice1: Dice = Dice1()
    val dice2: Dice = Dice2()
    val dice3: Dice = Dice3()

    val arrayOfDices = listOf(dice1, dice2, dice3)
    arrayOfDices.forEach { println(it.rollDice()) }
}

abstract class Dice(val numberOfFaces: Int) {
    open fun rollDice(): String {
        return "Выпало: ${(1..numberOfFaces).random()}"
    }
}

class Dice1 : Dice(NUMBER_OF_SIDES_OF_THE_FIRST_DICE)

class Dice2 : Dice(NUMBER_OF_SIDES_OF_THE_SECOND_DICE)

class Dice3 : Dice(NUMBER_OF_SIDES_OF_THE_THIRD_DICE)