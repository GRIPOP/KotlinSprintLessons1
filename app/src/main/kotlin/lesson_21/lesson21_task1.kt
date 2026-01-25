package org.example.app.lesson_21

fun main() {
    val word = "Hello"
    val vowels = "аеёиоуыэюяaeiou"
    var count = 0

    fun String.vowelCount() {
        for (i in this) {
            if (i.lowercase() in vowels) count++
        }

        println("Гласных букв в слове - $count")
    }

    word.vowelCount()
}
