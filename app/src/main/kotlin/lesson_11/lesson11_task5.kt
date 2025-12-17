package org.example.app.lesson_11

import kotlin.time.measureTime

fun main() {
    val person = Forum()
    val grisha = person.createNewUser("Grisha")
    person.createNewMessage(grisha.userId, "Hello")
    person.createNewMessage(grisha.userId, "I'm Grisha")

    val ivan = person.createNewUser("Ivan")
    person.createNewMessage(ivan.userId, "Hello")
    person.createNewMessage(ivan.userId, "I'm Ivan")

    person.printThread()

}

class Forum(
    val membersForum: MutableList<MemberForum> = mutableListOf(),
    val messages: MutableList<MessageForum> = mutableListOf()
) {

    var userIdCounter = 0

    fun createNewUser(user: String): MemberForum {
        val userNew = MemberForum(userIdCounter, user)
        membersForum.add(userNew)
        userIdCounter++
        return userNew
    }

    fun createNewMessage(authorId: Int, message: String) {
        val newMessage = MessageForum(authorId, message)
        messages.add(newMessage)
    }

    fun printThread() {
        for (message in messages) {
            val author = membersForum.find { it.userId == message.authorId }
            println("${author?.userName}: ${message.message} ")
        }
    }
}

class MemberForum(
    val userId: Int,
    val userName: String,
)

class MessageForum(
    val authorId: Int,
    val message: String,
)