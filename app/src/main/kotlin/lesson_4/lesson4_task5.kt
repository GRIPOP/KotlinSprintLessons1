package org.example.app.lesson_4

const val COUNT_BOX = 50
const val MIN_NUMBER_CREW = 55
const val MAX_NUMBER_CREW = 70

fun main() {
    print("Наличие повреждений корпуса: ")
    val damage = readln().toBoolean()
    print("Текущий состав экипажа: ")
    val numberOfCrew = readln().toInt()
    print("Количество ящиков с провизией на борту: ")
    val boxesOfProvisions = readln().toInt()
    print("Благоприятность метеоусловий: ")
    val weather = readln().toBoolean()

    print("Корабль может отправиться в плавание: ${(!damage &&
            numberOfCrew in MIN_NUMBER_CREW..MAX_NUMBER_CREW &&
            boxesOfProvisions > COUNT_BOX && weather) || 
            damage && numberOfCrew == MAX_NUMBER_CREW && 
            boxesOfProvisions > COUNT_BOX && weather}")
}