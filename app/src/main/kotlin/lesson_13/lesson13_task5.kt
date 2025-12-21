package org.example.app.lesson_13

fun main() {
    try {
        println("Введите имя контакта")
        val name = readln()
        println("Введите номер телефона")
        val number = readln().toLong()
        println("Введите название компании")
        val company = readln()
        val phone = PhoneV1(name, number, company)
    }
    catch (e: NumberFormatException) {
        println("Ошибка: ${e::class.simpleName}")
    }
}

class PhoneV1(
    val name: String,
    val number: Long,
    val company: String?,
)
