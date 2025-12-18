package org.example.app.lesson_13

fun main() {
    val bookOfPhone: Contacts = Contacts(listOf(
        PhoneDirectoryV3("Gosha", 89991112233, null),
        PhoneDirectoryV3("Pasha", 89992223344, null),
        PhoneDirectoryV3("Misha", 89993334455, "Google"),
        PhoneDirectoryV3("Katya", 89994445566, "Samsung"),
        PhoneDirectoryV3("Dasha", 89995556677, "null")))

    bookOfPhone.printAllCompanies()
}
class Contacts(val contacts: List<PhoneDirectoryV3>) {

    fun printAllCompanies(){
        contacts.forEach { it.infoCompanies() }
    }
}

class PhoneDirectoryV3(
    val name: String,
    val phone: Long,
    val company: String? = null,
) {

    fun infoCompanies() {
        if (company != null && company != "null") {
            println(company)
        }
    }
}