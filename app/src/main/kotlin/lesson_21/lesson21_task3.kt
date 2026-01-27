package org.example.app.lesson_21

fun main() {
    val player = Player("Greg", 100, 100)
    println(player.isHealthy())
}

class Player(val name: String, var currentHealth: Int, val maxHealth: Int)

fun Player.isHealthy(): Boolean = currentHealth == maxHealth