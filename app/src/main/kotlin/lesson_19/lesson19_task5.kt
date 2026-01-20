package org.example.app.lesson_19

const val CARD_INDEX_SIZE = 5

fun main() {
    val persons: MutableList<Person> = mutableListOf()
    println("Вводим имя и пол с Большой буквы. Пол вводим на русском языке")
    println("Доступные значения полов: ${Gender.entries.joinToString { it.nameGender }}")

    for (i in 1..CARD_INDEX_SIZE) {
        print("Введите имя: ")
        val name: String = readln()

        while (true) {
            print("Укажите пол: ")
            val genderForCheck = readln()
            val gender =
                Gender.entries.find { it.name == genderForCheck || it.nameGender == genderForCheck } // ищет совпадение в списке, Gender.entries, если не находит, то null
            if (gender != null) {
                persons.add(Person(name, gender))
                break
            } else {
                println("Вы ввели не верный пол. Попробуйте снова! Есть только такие варианты: ${Gender.entries.joinToString { it.nameGender }}")
            }
        }
    }
    persons.forEach { println("${it.name} - ${it.gender.nameGender}") }
}

enum class Gender(val nameGender: String) {
    MALE("Мужской"),
    FEMALE("Женский");
}

class Person(val name: String, val gender: Gender)
