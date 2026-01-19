package org.example.app.lesson_17

fun main() {
    val quiz = Quiz("How many corners are there in a rectangle?", "4")
}

class Quiz(question: String, answer: String) {
    var question: String = question
        get() = field

    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}
