package org.example.app.lesson_20

const val MAX_HEALTH = 100

fun main() {
    val player = Player("Zeus", 50, MAX_HEALTH)
    heal(player)
}

class Player(val name: String, var currentHealth: Int, val maxHealth: Int)

val heal: (Player) -> Int = {
    it.currentHealth = it.maxHealth
    it.currentHealth
}