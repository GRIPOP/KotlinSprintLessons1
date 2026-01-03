package org.example.app.lesson_15

fun main() {
    val passengerCar1 = PassengerCar("Легковой автомобиль", 3)
    passengerCar1.loadPassengers()
    passengerCar1.drive()
    passengerCar1.unloadPassengers()

    val passengerCar2 = PassengerCar("Легковой автомобиль", 2)
    passengerCar2.loadPassengers()
    passengerCar2.drive()
    passengerCar2.unloadPassengers()

    val truck = Truck("Грузовой автомобиль", 1, 2)
    truck.loadCargo()
    truck.loadPassengers()
    truck.drive()
    truck.unloadPassengers()
    truck.unloadCargo()
}

abstract class Car {
    abstract val typeCar: String
    abstract val numberPassenger: Int
}

class PassengerCar(override val typeCar: String, override val numberPassenger: Int) : Car(), Movable,
    PassengerTransportation {

    override fun loadPassengers() = println("Количество пассажиров, севших в машину: $numberPassenger")
    override fun drive() = println("$typeCar выехал из точки А в точку Б")
    override fun unloadPassengers() = println("Количество пассажиров, вышедших из машины: $numberPassenger")
}

class Truck(override val typeCar: String, override val numberPassenger: Int, val weightOfCargoInTons: Int) : Car(),
    Movable, PassengerTransportation, CargoTransportation {

    override fun loadCargo() = println("Загрузили вес в тоннах: $weightOfCargoInTons")
    override fun loadPassengers() = println("Количество пассажиров, севших в машину: $numberPassenger")
    override fun drive() = println("$typeCar выехал из точки А в точку Б")
    override fun unloadPassengers() = println("Количество пассажиров, вышедших из машины: $numberPassenger")
    override fun unloadCargo() = println("Выгрузили вес в тоннах: $weightOfCargoInTons")
}

interface Movable {

    fun drive()
}

interface PassengerTransportation {

    fun loadPassengers()
    fun unloadPassengers()
}

interface CargoTransportation {

    fun loadCargo()
    fun unloadCargo()
}