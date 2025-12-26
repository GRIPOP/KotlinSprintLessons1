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

    open fun loadMethod() {
        println("$name выдвигает горизонтальный трап со шкафута")
    }

    fun printInformation() {
        println(
            """
            Тип корабля - $name
            Скорость - $speed
            Грузоподъемность - $loadCapacity
            Пассожировместимость - $passengerCapacity
            Возможность колоть лёд - $breakingIce
        """.trimIndent().replace("\n", ", ")
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

    override fun loadMethod() {
        println("$name открывает ворота со стороны кормы")
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
    override fun loadMethod() {
        println("$name активирует погрузочный кран")
    }
}