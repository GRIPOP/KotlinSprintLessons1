package org.example.app.lesson_17

fun main() {
    val folder = Folder("Папка", 10, false)
    println(folder.name)
}

class Folder(name: String, private var numberFiles: Int, private val secret: Boolean) {

    val name: String = name
        get() {
            if (secret) return "Скрытая папка\nКоличество файлов в папке: 0"
            return "$field\nКоличество файлов в папке: $numberFiles"
        }
}