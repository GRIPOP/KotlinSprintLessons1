package org.example.app.lesson_11

fun main() {
    val room1 = Room("Flower", "Chat for talking about nothing")
    val person1 = Person(1, "satoshi", "Разговаривает", "https://example.com/avatar.png")
    val person2 = Person(2, "bobr", "Выключен микрофон", "https://example.com/avatar2.png")
    room1.addPerson(person1)
    room1.addPerson(person2)
}

class Room(
    val cover: String,
    val title: String,
    val participants: MutableList<Person> = mutableListOf(),
) {
    fun addPerson(person: Person) {
        participants.add(person)
    }

    fun updateStatus(nameUser: Person, newStatus: String) {
        nameUser.status = newStatus
    }
}

class Person(
    val id: Int,
    val name: String,
    var status: String,
    val avatar: String,
)