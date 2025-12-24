package org.example.app.lesson_14

fun main() {
    val liner = Liner("Лайнер")
    val iceBreaker = IceBreaker("Ледокол")
    val cargoShip = CargoShip("Грузовой корабль")
}

open class Liner(
    open val name: String,
    open val speed: Int = 150,
    open val loadCapacity: Int = 100,
    open val passengerCapacity: Int = 1000,
    open val breakingIce: Boolean = false,
)

class IceBreaker(
    override val name: String,
) : Liner(
    name = name,
    speed = 50,
    loadCapacity = 300,
    passengerCapacity = 100,
    breakingIce = true,
)

class CargoShip(
    override val name: String,
) : Liner(
    name = name,
    speed = 100,
    loadCapacity = 500,
    passengerCapacity = 50,
)
