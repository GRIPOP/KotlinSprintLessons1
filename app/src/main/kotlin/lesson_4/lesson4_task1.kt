package org.example.app.lesson_4

fun main() {
    val totalTables = 13
    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9
    println("Доступность столиков на сегодня: ${reservedTablesToday < totalTables} " +
            "\nДоступность столиков на завтра: ${reservedTablesTomorrow < totalTables}")
}