package org.example.app.lesson_20

fun main() {
    val foods = listOf("Бургер", "Яичница", "Шаурма", "Роллы")
    val lambdaList: List<() -> Unit> = foods.map {
        { println("Нажат элемент $it") }
    }

    lambdaList.forEach { if (lambdaList.indexOf(it) % 2 == 0) it() }
}
