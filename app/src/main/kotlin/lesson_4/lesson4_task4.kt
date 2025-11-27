package org.example.app.lesson_4

fun main() {
    val dayTrain = 5

    println("""
        Упражнения для рук: ${dayTrain % 2 != 0}
        Упражнения для ног: ${dayTrain % 2 == 0}
        Упражнения для спины: ${dayTrain % 2 == 0}
        Упражнения для пресса: ${dayTrain % 2 != 0}
    """.trimIndent())
}