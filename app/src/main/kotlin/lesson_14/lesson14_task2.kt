package org.example.app.lesson_14

fun main() {
    val liner = LinerT2("Лайнер")
    liner.printInformation()

    val iceBreakerT2 = IceBreakerT2("Ледокол")
    iceBreakerT2.printInformation()

    val cargoShipT2 = CargoShipT2("Грузовой корабль")
    cargoShipT2.printInformation()
}

open class LinerT2(
    open val name: String,
    open val speed: Int = 150,
    open val loadCapacity: Int = 100,
    open val passengerCapacity: Int = 1000,
    open val breakingIce: Boolean = false,
) {

    open fun loadingMethod() {
        println("$name выдвигает горизонтальный трап со шкафута")
    }

    fun printInformation() {
        println(
            "Тип корабля - $name, " +
                    "скорость - $speed, " +
                    "грузоподъемность - $loadCapacity, " +
                    "пассожировместимость - $passengerCapacity, " +
                    "возможность колоть лёд - $breakingIce "
        )
    }
}

class IceBreakerT2(
    override val name: String,
) : LinerT2(
    name = name,
    speed = 50,
    loadCapacity = 300,
    passengerCapacity = 100,
    breakingIce = true,
) {

    override fun loadingMethod() {
        println("$name активирует погрузочный кран")
    }
}

class CargoShipT2(
    override val name: String,
) : LinerT2(
    name = name,
    speed = 100,
    loadCapacity = 500,
    passengerCapacity = 50,
) {
    override fun loadingMethod() {
        println("$name открывает ворота со стороны кормы")
    }
}