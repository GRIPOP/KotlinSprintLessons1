package org.example.app.lesson_2

fun main() {
    val numberOfStudent: Float = 4.0f
    val firstGrade: Byte = 3
    val secondGrade: Byte = 4
    val thirdGrade: Byte = 3
    val fourthGrade: Byte = 5
    val sum: Int = firstGrade + secondGrade + thirdGrade + fourthGrade
    val averageGrade: Float = sum / numberOfStudent
    println(averageGrade)
}