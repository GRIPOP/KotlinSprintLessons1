package org.example.app.lesson_9

fun main() {
    val ingredients = mutableListOf("Печенье", "Сливочное масло", "Творожный сыр")
    println("В рецепте есть базовые ингредиенты: ${ingredients.joinToString()}")
    println("Желаете добавить еще?")

    val userDecision = readln()

    if (userDecision.trim().equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        ingredients.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты: ${ingredients.joinToString()}")
    }
    else {
        println("Никаких ингредиентов не было добавлено")
    }
}