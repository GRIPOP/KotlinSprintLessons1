package org.example.app.lesson_9

fun main() {
    val ingredientOnePortion = listOf(2, 50, 15)
    print("Укажите необходимое количество порций: ")
    val numberOfPortions = readln().toInt()

    val ingredientSeveralPortion = ingredientOnePortion.map {it * numberOfPortions}

    println("На $numberOfPortions порций вам понадобится: " +
            "Яиц – ${ingredientSeveralPortion[0]}шт, " +
            "молока – ${ingredientSeveralPortion[1]}мл, " +
            "сливочного масла – ${ingredientSeveralPortion[2]}г")
}