package org.example.app.lesson_21

import java.io.File

fun main() {
    val file = File("textFile.txt")
    print("Введите слово для перевода: ")
    file.writeToFileAndSend(readln())

    print("Введите слово для перевода: ")
    file.writeToFileAndSend(readln())
}

fun File.writeToFileAndSend(word: String) {
    val oldText = if (exists()) readText() else ""
    writeText("${word.lowercase()}\n$oldText")
}
