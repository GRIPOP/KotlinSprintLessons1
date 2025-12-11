package org.example.app.lesson_8

fun main() {
    val listOfIngredients = arrayOf("Печенье", "Сливочное масло", "Творожный сыр", "Сахар", "Яйца", "Сливки")
    println(listOfIngredients.contentToString())
    print("Какой ингредиент вы хотите заменить: ")
    val replaceableIngredient = readln()

    val index = listOfIngredients.indexOf(replaceableIngredient)

    if (index == -1) {
        println("Ингредиента $replaceableIngredient нет в списке")
    }
    else {
        val ingredientToReplace = readln()
        listOfIngredients[index] = ingredientToReplace
        println("Готово! Вы сохранили следующий список: ${listOfIngredients.contentToString()}")
    }
}