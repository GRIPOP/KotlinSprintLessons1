package org.example.app.lesson_13

fun main() {
    val person = PhoneDirectoryV2("Ростислав", 89123456789, "Reddit")
    person.printInfo()
}

class PhoneDirectoryV2(
    val name: String,
    val phone: Long,
    val company: String? = null,
) {

    fun printInfo() {
        println("-Имя: $name\n-Номер: $phone\n-Компания: ${company ?: "<не указано>"}")
    }
}