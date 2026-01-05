package org.example.app.lesson_17

fun main() {
    val ship = Ship("Wave", 50, "Port")
    ship.name = "123"
}

class Ship(name: String, val averageSpeed: Int, val port: String) {

    var name: String = name
        set(value) {
            if (value != field) println("Нельзя менять поле name")
        }
}