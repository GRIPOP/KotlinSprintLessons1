package org.example.app.lesson_13

fun main() {
    val phone1 = Phone(readln(), readln().toLongOrNull(), readln())
    phone1.checkNameCompany()
    phone1.checkNumber()
}

class Phone(
    val name: String?,
    val number: Long?,
    val company: String?,
    val contacts: MutableList<Phone> = mutableListOf()
) {

    fun checkNumber() {
        if (number != null) {
            contacts.add(Phone(name, number, company))
        } else {
            println("Вы не ввели номер телефона")
        }
    }

    fun checkNameCompany(): String? {
        return (company?.ifEmpty { null })
    }
}