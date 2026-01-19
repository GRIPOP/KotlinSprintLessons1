package org.example.app.lesson_19

fun main() {
    val tank = Tank()

    tank.raiseNewPatron(Patron.RED)
    tank.raiseNewPatron(Patron.BLUE)
    tank.shoot(Patron.RED)
    tank.shoot(Patron.BLUE)
}

enum class Patron(val colorPatron: String, val impactForce: Int) {
    BLUE("Синий", 5),
    GREEN("Зеленый", 10),
    RED("Красный", 20)
}

class Tank(val patrons: MutableSet<Patron> = mutableSetOf()) {

    fun raiseNewPatron(patron: Patron) {
        println("Подняли патрон $patron")
        patrons.add(patron)
    }

    fun shoot(colorPatron: Patron) {
        println("Нанесенный урон - ${colorPatron.impactForce} единиц")
    }
}
