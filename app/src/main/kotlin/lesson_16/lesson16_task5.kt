package org.example.app.lesson_16

fun main() {
    val player = Player("Stone", 100, 10)
    player.takeDamage(15)
    player.toHeal(30)
    player.takeDamage(100)
    player.takeDamage(50)
}

class Player(val name: String, private var health: Int, var impactForce: Int) {
    private var isDead = false

    fun takeDamage(damage: Int) {
        if (isDead) return

        if (damage >= health) {
            isDead = true
            death()
        } else {
            health -= damage
        }
    }

    fun toHeal(addHealth: Int) {
        if (!isDead) health += addHealth
    }

    private fun death() {
        impactForce = 0
        health = 0
        println("Игрок $name умер! Игра закончена!")
    }
}