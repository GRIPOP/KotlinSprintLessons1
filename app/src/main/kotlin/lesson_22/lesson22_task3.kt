package org.example.app.lesson_22

fun main() {
    val racingCar = Auto("BWM", "M3 GTR E46", 2001)
    val brand = racingCar.component1()
    val model = racingCar.component2()
    val yearOfRelease = racingCar.component3()

    println(brand)
    println(model)
    println(yearOfRelease)
}

data class Auto(val brand: String, val model: String, val yearOfRelease: Int)
