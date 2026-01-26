package org.example.app.lesson_20

const val MAX_HEALTH = 100

fun main() {
    val player = Player2("Zeus", 50, MAX_HEALTH)
    heal(player)
    println(player.currentHealth)
}

class Player2(val name: String, var currentHealth: Int, val maxHealth: Int)

val heal: (Player2) -> Unit = { it: Player2 -> it.currentHealth = it.maxHealth }