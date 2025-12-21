package org.example.app.lesson_13

fun main() {
    val contacts: MutableList<Phone> = mutableListOf()
    var counter = 2

    while (counter > 0) {
        println("Введите номер телефона")
        val phoneNumber: Long? = readln().toLongOrNull()
        if (phoneNumber != null) {
            println("Введите имя контакта")
            val name = readln()
            println("Введите название компании")
            val company = readln().ifEmpty { null }
            val phone = Phone(name, phoneNumber, company)
            contacts.add(phone)
        } else {
            println("Вы не ввели номер телефона")
        }
        counter--
    }

    contacts.forEach { it.printInfo()}
}

class Phone(
    val name: String,
    val number: Long,
    val company: String?,
) {

    fun printInfo() {
        println("Имя - $name, Телефон - $number, Компания - ${company ?: "не указана"}")
    }
}