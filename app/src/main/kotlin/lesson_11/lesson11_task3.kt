package org.example.app.lesson_11

fun main() {
    val room1 = Room("Flower", "Chat for talking about nothing",
        mutableListOf(
            Person(1, "satoshi", "Разговаривает", "https://example.com/avatar.png"),
            Person(2, "bobr", "Выключен микрофон", "https://example.com/avatar2.png")))
}

class Room(
    val cover: String,
    val title: String,
    val participants: MutableList<Person> = mutableListOf(),
) {
    fun addPerson(person: Person) {
        participants.add(person)
    }
}

class Person(
    val id: Int,
    val name: String,
    val status: String,
    val avatar: String,
)