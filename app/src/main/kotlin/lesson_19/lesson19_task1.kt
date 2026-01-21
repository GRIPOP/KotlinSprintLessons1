package org.example.app.lesson_19

fun main() {
    println("Список рыб, которых можно добавить в аквариум")
    Fish.entries.forEach { println(it.nameFish) }
}

enum class Fish(val nameFish: String) {
    GUPPY("Гуппи"),
    ANGEL_FISH("Скалярия"),
    GOLD_FISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}