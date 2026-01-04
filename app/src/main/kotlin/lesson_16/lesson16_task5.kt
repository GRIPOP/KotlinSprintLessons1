package org.example.app.lesson_16

fun main() {
    val player = Player(100, "Stone", 10)

    player.takeDamage(50)
    player.toHeal(30)
    player.takeDamage(40)
    player.takeDamage(30)
    player.takeDamage(40)
}

class Player(private var health: Int, val name: String, var impactForce: Int) {

    fun takeDamage(damage: Int) {
        health -= damage
        if (health <= 0) {
            death()
        }
    }

    fun toHeal(addHealth: Int) {
        health += addHealth
    }

    private fun death() {
        impactForce = 0
        health = 0
        println("Игрок $name умер! Игра закончена!")
    }
}