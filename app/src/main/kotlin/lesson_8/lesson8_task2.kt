package org.example.app.lesson_8

fun main() {
    val listOfIngredients = arrayOf("Печенье", "Сливочное масло", "Творожный сыр", "Сахар", "Яйца", "Сливки")
    print("Введите интересующий вас ингредиент: ")
    val userIngredients = readln()

    for (i in listOfIngredients) {
        if (userIngredients.lowercase() == i.lowercase()) {
            println("Ингредиент $userIngredients в рецепте есть")
            return
        }
    }

    print("Такого ингредиента в рецепте нет")
}