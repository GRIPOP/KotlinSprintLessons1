package org.example.app.lesson_19

const val CARD_INDEX_SIZE = 5

fun main() {
    println("Вводим имя и пол с Большой буквы. Пол вводим на русском языке")
    println("Доступные значения полов: ${Gender.entries.joinToString { it.nameGender }}")

    val persons = buildList {
        for (i in 1..CARD_INDEX_SIZE) {
            print("Введите имя: ")
            val name = readln()
            var gender: Gender?

            while (true) {
                print("Укажите пол: ")
                val genderForCheck = readln()
                gender = Gender.entries.find { it.name == genderForCheck || it.nameGender == genderForCheck }
                if (gender != null) {
                    break
                } else {
                    println("Вы ввели не верный пол. Попробуйте снова! Есть только такие варианты: ${Gender.entries.joinToString { it.nameGender }}")
                }
            }
            add(Person(name, gender))
        }
    }

    persons.forEach { it.printInfo() }
}

enum class Gender(val nameGender: String) {
    MALE("Мужской"),
    FEMALE("Женский"),
}

class Person(val name: String, val gender: Gender) {

    fun printInfo() {
        println("$name - ${gender.nameGender}")
    }
}
