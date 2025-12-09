package org.example.app.lesson_9

fun main() {
    val listOfIngredients = mutableListOf("Печенье", "Сливочное масло", "Творожный сыр", "Сахар", "Яйца", "Сливки")
    println("В рецепте есть следующие ингредиенты: $listOfIngredients")

    listOfIngredients.forEach {
        println(it)
    }
}