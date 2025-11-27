package org.example.app.lesson_4

const val LEFT_PARAMETER_WEIGHT = 35
const val RIGHT_PARAMETER_WEIGHT = 100
const val PARAMETER_SIZE= 100

fun main() {
    val firstWeight = 20
    val firstSize = 80
    val secondWeight = 50
    val secondSize = 100

    println("Груз с весом $firstWeight кг и обьёмом $firstSize л соответствует категории 'Average': ${(firstWeight > LEFT_PARAMETER_WEIGHT && firstWeight <= RIGHT_PARAMETER_WEIGHT) && (firstSize < PARAMETER_SIZE)} " +
            "\nГруз с весом $secondWeight кг и обьёмом $secondSize л соответствует категории 'Average': ${(secondWeight > LEFT_PARAMETER_WEIGHT && secondWeight <= RIGHT_PARAMETER_WEIGHT) && (secondSize < PARAMETER_SIZE)}")
}