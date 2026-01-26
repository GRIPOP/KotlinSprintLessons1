package org.example.app.lesson_21

fun main() {
    val skills: Map<String, Int> = mapOf(
        "Стрельба" to 70,
        "Ближний бой" to 10,
        "Магия огня" to 400,
        "Скрытность" to 80,
        "Магия воды" to 400,
    )

    println(skills.maxCategory())
}

fun Map<String, Int>.maxCategory(): String {
    return maxBy { it.value }.key
}