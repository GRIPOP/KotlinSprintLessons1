package org.example.app.lesson_9

fun main() {
    print("Введите список ингредиентов: ")
    val ingredients = readln()

    println(ingredients.split(", ").sorted().joinToString())
}