package org.example.app.lesson_16

fun main() {
    val cube = Cube()
    cube.printRandomNumber()
}

class Cube(val randomNumber: Int = (1..6).random()) {

    fun printRandomNumber() = println(randomNumber)
}