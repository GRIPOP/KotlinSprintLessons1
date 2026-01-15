package org.example.app.lesson_15

const val MAX_NUMBERS_PASSENGERS_IN_PASSENGERS_CAR = 3
const val MAX_NUMBERS_PASSENGERS_IN_TRUCK = 1
const val MAX_WEIGHT_OF_CARGO_IN_KILOGRAMS = 2000

fun main() {
    val passengerCar = PassengerCar()
    val passengerCar2 = PassengerCar()
    val truck = Truck()

    passengerCar.loadPassengers()
    passengerCar.loadPassengers()
    passengerCar.loadPassengers()
    passengerCar2.loadPassengers()
    passengerCar2.loadPassengers()
    truck.loadPassengers()
    truck.loadCargo(2)

    truck.unloadPassengers()
    truck.unloadCargo(2)

    passengerCar.unloadPassengers()
    passengerCar.unloadPassengers()
    passengerCar.unloadPassengers()

    passengerCar2.unloadPassengers()
    passengerCar2.unloadPassengers()
}

abstract class Car {
    abstract var numberPassengers: Int
}

class PassengerCar() : Car(), Movable, PassengerTransportable {
    override var numberPassengers: Int = 0

    override fun loadPassengers() {

        if (numberPassengers < MAX_NUMBERS_PASSENGERS_IN_PASSENGERS_CAR) {
            numberPassengers++
            println("Кол-во пассажиров в машине $numberPassengers")
        } else {
            println("Мест в машине больше нет!")
        }
    }

    override fun unloadPassengers() {

        if (numberPassengers != 0) {
            numberPassengers--
            println("Количество пассажиров в машине $numberPassengers")
        } else {
            println("Пассажиров в машине нет! Выгружать некого!")
        }
    }
}

class Truck() : Car(), Movable, PassengerTransportable, CargoTransportable {
    override var numberPassengers: Int = 0
    var weightOfCargoInTons: Int = 0

    override fun loadCargo(weightInTons: Int) {
        if (weightOfCargoInTons <= MAX_WEIGHT_OF_CARGO_IN_KILOGRAMS) {
            weightOfCargoInTons += weightInTons
            println("Груз загружен. Масса груза в тоннах $weightOfCargoInTons")
        } else {
            println("Больше 2 тонн загрузка запрещена!")
        }
    }

    override fun unloadCargo(weight: Int) {

        if (weightOfCargoInTons > 0) {
            weightOfCargoInTons -= weight
            println("Груз выгружен. Оставшаяся масса груза в тоннах $weightOfCargoInTons")

        }
    }

    override fun loadPassengers() {

        if (numberPassengers > 0) {
            numberPassengers--
            println("Пассажиров в машине ${MAX_NUMBERS_PASSENGERS_IN_TRUCK - numberPassengers}")
        } else {
            println("Мест в машине больше нет!")
        }
    }

    override fun unloadPassengers() {

        if (numberPassengers != MAX_NUMBERS_PASSENGERS_IN_TRUCK) {
            println("Пассажир высажен. Сводобных мест в машине ${++numberPassengers}")
        } else {
            println("Пассажиров в машине нет! Выгружать некого!")
        }
    }
}

interface Movable {

    fun drive() {
        println("Машина поехала")
    }
}

interface PassengerTransportable {
    fun loadPassengers()
    fun unloadPassengers()
}

interface CargoTransportable {
    fun loadCargo(weightInTons: Int)
    fun unloadCargo(weight: Int)
}