package org.example.app.lesson_20

fun main() {
    val robot = Robot(
        listOf(
            "Приветствую Вас!",
            "Готов помочь вам в решении любой проблемы!",
            "Задайте какой-нибудь вопрос",
            "Есть новости?",
            "Расскажи что-нибудь интересное"
        )
    )

    robot.say()
    robot.setModifier { phrase: String -> phrase.reversed() }
    robot.say()
}

class Robot(val phrases: List<String>) {
    private var currentModifier: (String) -> String = { it: String -> it }

    fun setModifier(newModifier: (String) -> String) {
        currentModifier = newModifier
    }

    fun say() {
        println(currentModifier(phrases.random()))
    }
}