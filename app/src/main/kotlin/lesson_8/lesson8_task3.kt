package org.example.app.lesson_8

fun main() {
    val listOfIngredients = arrayOf("Печенье", "Сливочное масло", "Творожный сыр", "Сахар", "Яйца", "Сливки")
    print("Введите интересующий вас ингредиент: ")
    val userIngredients = readln()

    if (userIngredients in listOfIngredients) {
        println("Ингредиент $userIngredients в рецепте есть")
    }
    else {
        println("Такого ингредиента в рецепте нет")
    }
}