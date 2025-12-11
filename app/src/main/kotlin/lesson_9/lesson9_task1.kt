package org.example.app.lesson_9

fun main() {
    val ingredients = listOf("Печенье", "Сливочное масло", "Творожный сыр", "Сахар", "Яйца", "Сливки")
    println("В рецепте есть следующие ингредиенты: $ingredients")

    ingredients.forEach {
        println(it)
    }
}