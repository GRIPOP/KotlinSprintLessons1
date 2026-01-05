package org.example.app.lesson_17

fun main() {
    val folder = Folders("Папка", 10, true)
    println(folder.name)
}

class Folders(name: String, var numberFiles: Int, var secret: Boolean) {

    val name: String = name
        get() {
            if (!secret) return "$field\nКоличество файло в папке: $numberFiles"
            else return "Скрытая папка\nКоличество файлов в папке: 0"
        }
}