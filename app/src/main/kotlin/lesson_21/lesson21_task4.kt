package org.example.app.lesson_21

import java.io.File

fun main() {
    val file = File("textFile.txt")
    file.writeToFileAndSend()
    file.writeToFileAndSend()
}

fun File.writeToFileAndSend() {
    if (!this.exists()) {
        print("Введите слово для перевода: ")
        val message = readln().lowercase()
        createNewFile()
        writeText(message)
    } else {
        val oldText = readText()
        print("Введите слово для перевода: ")
        val message = readln().lowercase()
        writeText("$message\n$oldText")
    }
}
