package org.example.app.lesson_8

fun main() {
    val numberOfViewsOnDay = intArrayOf((10..100).random(), (10..100).random(),
        (10..100).random(), (10..100).random(), (10..100).random(),
        (10..100).random(), (10..100).random())

    println(numberOfViewsOnDay.sum())
}