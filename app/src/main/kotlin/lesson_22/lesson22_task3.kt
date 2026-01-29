package org.example.app.lesson_22

fun main() {
    val racingCar = Auto("BWM", "M3 GTR E46", 2001)
    val (brand, model, yearOfRelease) = racingCar

    println(brand)
    println(model)
    println(yearOfRelease)
}

data class Auto(val brand: String, val model: String, val yearOfRelease: Int)
