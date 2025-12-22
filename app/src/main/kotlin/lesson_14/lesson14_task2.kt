package org.example.app.lesson_14

fun main() {
    val linerT2 = LinerT2()
    linerT2.printInformation()
    val iceBreakerT2 = IceBreakerT2("Ледокол", 50, 100, 50)
    iceBreakerT2.printInformation()
    val cargoShipT2 = CargoShipT2("Грузовой корабль", 100, 500, 100)
    cargoShipT2.printInformation()
}

open class LinerT2 (
    val name: String = "Лайнер",
    val speed: Int  = 150,
    val loadCapacity: Int = 100,
    val passengerCapacity: Int = 1000,
    val breakingIce: Boolean = false,
    val loadingMethod: String = "$name выдвигает горизонтальный трап со шкафута"
) {

    open fun printLoadingMethod() {
        println(loadingMethod)
    }

    open fun printInformation() {
        LinerT2().let {
            print("Корабль: $name, ")
            print("Скорость: $speed, ")
            print("Грузоподъемность: $loadCapacity, ")
            print("Пассажировместимость: $passengerCapacity, ")
            print("Возможность колоть лед: $breakingIce, ")
            println("Способ погрузки - $loadingMethod")
        }
    }
}

class IceBreakerT2(
    name: String,
    speed: Int,
    loadCapacity: Int,
    passengerCapacity: Int,
): LinerT2(name, speed, loadCapacity,passengerCapacity, breakingIce = true, loadingMethod = "$name открывает ворота со стороны кормы") {

    override fun printLoadingMethod() {
        println(loadingMethod)
    }
}

class CargoShipT2(
    name: String,
    speed: Int,
    loadCapacity: Int,
    passengerCapacity: Int,
): LinerT2(name, speed, loadCapacity,passengerCapacity, loadingMethod = "$name активирует погрузочный кран") {

    override fun printLoadingMethod() {
        println(loadingMethod)
    }
}