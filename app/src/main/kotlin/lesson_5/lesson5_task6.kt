package org.example.app.lesson_5

const val FROM_CM_IN_METER = 100
const val FIRST_WEIGHT_LIMIT = 18.5
const val SECOND_WEIGHT_LIMIT = 25
const val THIRD_WEIGHT_LIMIT = 30

fun main() {
    print("Введите вес в кг: ")
    val userWeight = readln().toDouble()
    print("Введите рост в см: ")
    val userHeight = readln().toDouble() / FROM_CM_IN_METER

    val imt = userWeight / (userHeight * userHeight)
    when {
        imt < FIRST_WEIGHT_LIMIT -> println("Недостаточная масса тела")
        imt < SECOND_WEIGHT_LIMIT -> println("Нормальная масса тела")
        imt < THIRD_WEIGHT_LIMIT -> println("Избыточная масса тела")
        else -> println("Ожирение")
    }

    println(String.format("Ваш ИМТ = %.2f", imt))
}