package org.example.app.lesson_20

fun main() {
    val player = Player()
    val player2 = Player(true)
    val openDoor: (Player) -> String = {
        if (it.isHaveKey) {
            "Игрок открыл дверь"
        } else {
            "Дверь заперта"
        }
    }

    println(openDoor(player))
    println(openDoor(player2))
}

class Player(var isHaveKey: Boolean = false)
