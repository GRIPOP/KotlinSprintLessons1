package org.example.app.lesson_5

fun main() {
    val firstWinnerNumber = (0..42).random()
    val secondWinnerNumber = (0..42).random()
    print("Введите первое число: ")
    val firstUserNumber = readln().toInt()
    print("Введите второе число: ")
    val secondUserNumber = readln().toInt()

    if ((firstUserNumber == firstWinnerNumber && secondUserNumber == secondWinnerNumber)
        || (firstUserNumber == secondWinnerNumber && secondUserNumber == firstWinnerNumber)) {
        println("Поздравляем! Вы выиграли главный приз!")
    }
    else if (firstUserNumber == firstWinnerNumber || firstUserNumber ==
        secondWinnerNumber || secondUserNumber == firstWinnerNumber
        || secondUserNumber == secondWinnerNumber) {
        println("Вы выиграли утешительный приз!")
    }
    else {
        println("Неудача!")
    }

    println("Первое выигрышное число: $firstWinnerNumber")
    println("Второе выигрышное число: $secondWinnerNumber")
}