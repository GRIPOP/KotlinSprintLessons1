package org.example.app.lesson_9

fun main() {
    val numbers = 5
    val ingredients = MutableList(numbers) { "" }
    println("Введите название ингредиентов")

    for (i in 0 until numbers) {
        val userIngredient = readln()
        ingredients[i] = userIngredient.lowercase()
        }

    println(ingredients.toSet().sorted().joinToString().replaceFirstChar { it.uppercaseChar() })
}