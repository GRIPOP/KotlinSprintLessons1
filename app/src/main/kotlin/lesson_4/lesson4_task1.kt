package org.example.app.lesson_4

const val TOTAL_TABLES = 13

fun main() {
    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9
    println("Доступность столиков на сегодня: ${reservedTablesToday < TOTAL_TABLES} " +
            "\nДоступность столиков на завтра: ${reservedTablesTomorrow < TOTAL_TABLES}")
}