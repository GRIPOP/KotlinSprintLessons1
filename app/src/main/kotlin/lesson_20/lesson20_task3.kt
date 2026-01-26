package org.example.app.lesson_20

fun main() {
    val player = Player1()
    val player2 = Player1(true)
    val openDoor: (Player1) -> String = {
        if (it.isHaveKey) {
            "Игрок открыл дверь"
        } else {
            "Дверь заперта"
        }
    }

    println(openDoor(player))
    println(openDoor(player2))
}

class Player1(var isHaveKey: Boolean = false)
