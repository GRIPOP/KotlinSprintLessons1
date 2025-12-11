package org.example.app.lesson_9

fun main() {
    val ingredient = mutableListOf("Печенье", "Сливочное масло", "Творожный сыр")
    println("В рецепте есть базовые ингредиенты: ${ingredient.joinToString()}")
    println("Желаете добавить еще?")

    val userDecision = readln()

    if (userDecision.trim().equals("да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        val addIngredient = readln()
        ingredient.add(addIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: ${ingredient.joinToString()}")
    }
    else {
        println("Никаких ингредиентов не было добавлено")
    }
}