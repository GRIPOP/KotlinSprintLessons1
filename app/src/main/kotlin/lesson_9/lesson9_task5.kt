package org.example.app.lesson_9

fun main() {
    val numbers = 5
    val emptyStrings = Array(numbers) { "" }
    println("Введите название ингредиентов")

    for (i in 0 until numbers) {
        if (i == 0) {
            val userIngredient = readln()
            emptyStrings[i] = userIngredient
        }
        else {
            val userIngredient = readln().lowercase()
            emptyStrings[i] = userIngredient
        }
    }

    println(emptyStrings.sorted().toSet().joinToString())
}