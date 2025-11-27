package org.example.app.lesson_4

fun main() {
    print("Наличие повреждений корпуса: ")
    val damage = readln().toBoolean()
    print("Текущий состав экипажа: ")
    val numberOfCrew = readln().toInt()
    print("Количество ящиков с провизией на борту: ")
    val boxesOfProvisions = readln().toInt()
    print("Благоприятность метеоусловий: ")
    val weather = readln().toBoolean()

    print("Корабль может отправиться в плавание: ${(!damage && numberOfCrew in 55..70 && boxesOfProvisions > 50 && weather) ||
    damage && numberOfCrew == 70 && boxesOfProvisions > 50 && weather}")
}