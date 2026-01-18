package org.example.app.lesson_19

fun main() {
    println("Список рыб, которых можно добавить в аквариум")
    Fish.entries.forEach { println(it) }
}

enum class Fish {
    GUPPY,
    ANGEL_FISH,
    GOLD_FISH,
    SIAMESE_FIGHTING_FISH,
}