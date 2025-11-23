package org.example.app.lesson_2
import java.util.Locale

fun main() {
    val numberOfStudent: Byte = 4
    val firstGrade: Byte = 3
    val secondGrade: Byte = 4
    val thirdGrade: Byte = 3
    val fourthGrade: Byte = 5

    val sum: Float = (firstGrade + secondGrade + thirdGrade + fourthGrade).toFloat()
    val averageGrade: Float = sum / numberOfStudent

    println(String.format(Locale.US, "%.2f", averageGrade))
}