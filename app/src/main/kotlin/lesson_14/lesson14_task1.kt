package org.example.app.lesson_14

//В компьютерной игре есть три типа судов: лайнер, грузовой и ледокол.
//Все суда основаны на базовом классе лайнера, но каждый из них имеет свой функционал и дополнительные свойства.
//
//- У грузовых судов скорость меньше, но грузоподъемность больше.
//- У ледоколов ниже и скорость, и вместительность, но они могут колоть лёд.
//- Лайнеры могут вмещать наибольшее количество пассажиров.

fun main() {
    val liner = Liner()
    val iceBreaker = IceBreaker(50, 100, 50)
    val cargoShip = CargoShip(100, 500, 100)
}

open class Liner (val speed: Int  = 150,
             val loadCapacity: Int = 100,
             val passengerCapacity: Int = 1000,
             val breakingIce: Boolean = false,
)

class IceBreaker(speed: Int,
                 loadCapacity: Int,
                 passengerCapacity: Int,
): Liner(speed, loadCapacity,passengerCapacity, breakingIce = true)

class CargoShip(speed: Int,
                loadCapacity: Int,
                passengerCapacity: Int,
): Liner(speed, loadCapacity,passengerCapacity)
