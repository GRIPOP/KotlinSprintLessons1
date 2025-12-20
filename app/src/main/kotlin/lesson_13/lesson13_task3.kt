package org.example.app.lesson_13

fun main() {
    val bookOfPhone = (listOf(
        PhoneDirectoryV3("Gosha", 89991112233, null),
        PhoneDirectoryV3("Pasha", 89992223344, null),
        PhoneDirectoryV3("Misha", 89993334455, "Google"),
        PhoneDirectoryV3("Katya", 89994445566, "Samsung"),
        PhoneDirectoryV3("Dasha", 89995556677, "null")))

    println((bookOfPhone.mapNotNull { it.company }).joinToString())
}

class PhoneDirectoryV3(
    val name: String,
    val phone: Long,
    val company: String? = null,
)