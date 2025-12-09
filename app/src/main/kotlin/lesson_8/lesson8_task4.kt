package org.example.app.lesson_8

fun main() {
    val listOfIngredients = arrayOf("Печенье", "Сливочное масло", "Творожный сыр", "Сахар", "Яйца", "Сливки")
    println(listOfIngredients.contentToString())
    print("Какой ингредиент вы хотите заменить: ")
    val replaceableIngredient = readln()

    if (replaceableIngredient !in listOfIngredients) {
        println("Ингредиента нет в списке")
    }
    else {
        print("Введите ингредиент для замены: ")
        val ingredientToReplace = readln()
        listOfIngredients[listOfIngredients.indexOf(replaceableIngredient)] = ingredientToReplace
    }

    println(listOfIngredients.contentToString())
}