package org.example.app.lesson_8

fun main () {
    print("Введите длину списка ингредиентов: ")
    val numberIngredients = readln().toInt()
    val emptyStrings = Array(numberIngredients) { "" }

    for (i in 0 until numberIngredients) {
        print("Введите название ингредиента: ")
        val userIngredient = readln()
        emptyStrings[i] = userIngredient

    }
    println(emptyStrings.joinToString())
}