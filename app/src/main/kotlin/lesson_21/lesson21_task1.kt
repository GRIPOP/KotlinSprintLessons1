package org.example.app.lesson_21

fun main() {
    val word = "Hello"
    println(word.vowelCount())
}

fun String.vowelCount(): Int {
    var count = 0
    val vowels = "аеёиоуыэюяaeiou"
    for (i in this) {
        if (i.lowercase() in vowels) count++
    }

    return count
}
