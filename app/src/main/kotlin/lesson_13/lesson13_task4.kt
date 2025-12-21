package org.example.app.lesson_13

fun main() {
    val contacts: MutableList<Phone> = mutableListOf()
    var counter = 3

    while (counter > 0) {
        val phoneNumber: Long? = readln().toLongOrNull()

        if (phoneNumber != null) {
            val phone = Phone(readln(), phoneNumber, readln())
            if (phone.company == "") phone.company = null
            if (phone.name == "") phone.name = null
            contacts.add(phone)
        } else {
            println("Вы не ввели номер телефона")
        }
        counter--
    }

    contacts.forEach { it.printInfo()}
}

class Phone(
    var name: String?,
    val number: Long?,
    var company: String?,
) {

    fun printInfo() {
        println("$name, $number, $company")
    }
}