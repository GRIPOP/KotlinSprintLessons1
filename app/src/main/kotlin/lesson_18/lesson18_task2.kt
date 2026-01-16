package org.example.app.lesson_18

const val NUMBER_OF_SIDES_OF_THE_FIRST_DICE = 4
const val NUMBER_OF_SIDES_OF_THE_SECOND_DICE = 6
const val NUMBER_OF_SIDES_OF_THE_THIRD_DICE = 8

fun main() {
    val dice1: Dice = Dice1()
    val dice2: Dice = Dice2()
    val dice3: Dice = Dice3()

    val arrayOfDices = listOf<Dice>(dice1, dice2, dice3)
    arrayOfDices.forEach { println(it.rollDice()) }
}

open class Dice() {
    open fun rollDice(): String = ""
}

class Dice1(val side: Int = NUMBER_OF_SIDES_OF_THE_FIRST_DICE) : Dice() {

    override fun rollDice(): String {
        return "Выпало: ${(1..side).random()}"
    }
}

class Dice2(val side: Int = NUMBER_OF_SIDES_OF_THE_SECOND_DICE) : Dice() {

    override fun rollDice(): String {
        return "Выпало: ${(1..side).random()}"
    }
}

class Dice3(val side: Int = NUMBER_OF_SIDES_OF_THE_THIRD_DICE) : Dice() {

    override fun rollDice(): String {
        return "Выпало: ${(1..side).random()}"
    }
}