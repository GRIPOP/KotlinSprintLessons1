package org.example.app.lesson_19

fun main() {
    val tank = Tank()
    println(tank.raiseNewPatron(Patron.RED))
    tank.shoot()
    tank.shoot()
    println(tank.raiseNewPatron(Patron.BLUE))
    tank.shoot()
    tank.shoot()
}

enum class Patron(val impactForce: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank(private var currentAmmo: Patron? = null) {

    fun raiseNewPatron(patron: Patron) {
        currentAmmo = patron
    }

    fun shoot() {
        println("Нанесенный урон - ${currentAmmo?.impactForce ?: "Урона нет. Танк ничем не заряжен"}")
        currentAmmo = null
    }
}
