package org.example.app.lesson_20

fun main() {
    val player = Player()
    val openDoor: (Player) -> Unit = {
        if (it.isHaveKey) {
            println("Игрок открыл дверь")
        } else {
            println("Дверь заперта")
        }
    }
    openDoor(player)
}

class Player(var isHaveKey: Boolean = false)