package org.example.app.lesson_15

fun main() {
    val instrument = Instrument("Скрипка", 2)
    val parts = PartsOfInstrument("Струны для скрипки", 1)
    instrument.searchParts()
}

abstract class InfoProducts {
    abstract val name: String
    abstract val amount: Int
}

interface Search {
    fun searchParts() = println("Выполняется поиск")
}

class Instrument(override val name: String, override val amount: Int) : InfoProducts(), Search

class PartsOfInstrument(override val name: String, override val amount: Int) : InfoProducts()