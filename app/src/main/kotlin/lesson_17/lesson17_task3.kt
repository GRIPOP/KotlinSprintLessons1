package org.example.app.lesson_17

fun main() {
    val folder = Folder("Папка", 10, true)
    println(folder.name)
    println(folder.numberFiles)
}

class Folder(name: String, numberFiles: Int, private val secret: Boolean) {

    var name: String = name
        get() {
            return if (secret) "Скрытая папка"
            else field
        }

    var numberFiles: Int = numberFiles
        get() {
            if (secret) {
                print("Количество файлов в папке - ")
                return 0
            } else {
                print("Количество файлов в папке - ")
                return field
            }
        }
}