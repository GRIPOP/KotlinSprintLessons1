package org.example.app.lesson_5

import kotlin.io.println

fun main() {
    print("Введите вес в кг: ")
    val userWeight = readln().toDouble()
    print("Введите рост в см: ")
    var userHeight = readln().toDouble()

    userHeight = userHeight / 100
    val IMT = userWeight / (userHeight * userHeight)
    if (IMT < 18.5) {
        println("Недостаточная масса тела")
    }
    else if (IMT >= 18 && IMT < 25) {
        println("Нормальная масса тела")
    }
    else if (IMT >= 25 && IMT < 30 ) {
        println("Избыточная масса тела")
    }
    else {
        println("Ожирение")
    }

    println(String.format("Ваш ИМТ = %.2f", IMT))

}