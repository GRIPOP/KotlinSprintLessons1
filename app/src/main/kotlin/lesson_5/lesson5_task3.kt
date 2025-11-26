package org.example.app.lesson_5

const val FIRST_WIN_NUMBER = 10
const val SECOND_WIN_NUMBER = 23

fun main() {
    print("Введите первое значение: ")
    val firstUserNumber = readln().toInt()
    print("Введите второе значение: ")
    val secondUserNumber = readln().toInt()

    if ((firstUserNumber == FIRST_WIN_NUMBER && secondUserNumber == SECOND_WIN_NUMBER)
        || (firstUserNumber == SECOND_WIN_NUMBER && secondUserNumber == FIRST_WIN_NUMBER)){
        println("Поздравляем! Вы выиграли главный приз!")
    }
    else if (firstUserNumber == FIRST_WIN_NUMBER || firstUserNumber == SECOND_WIN_NUMBER || secondUserNumber == FIRST_WIN_NUMBER
        || secondUserNumber == SECOND_WIN_NUMBER) {
        println("Вы выиграли утешительный приз!")
    }
    else {println("Неудача!")}
}