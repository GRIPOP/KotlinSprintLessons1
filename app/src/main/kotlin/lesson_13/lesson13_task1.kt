package org.example.app.lesson_13

fun main() {
    val phone1 = PhoneDirectory("Alex", 89997776655, null)
}

class PhoneDirectory(
    val name: String,
    val phone: Long,
    val company: String?,
)