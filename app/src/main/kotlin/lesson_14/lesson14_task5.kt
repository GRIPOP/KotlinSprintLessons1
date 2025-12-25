package org.example.app.lesson_14

fun main() {

}

open class Chat(
    var messagesChat: MutableList<Message> = mutableListOf(),
) {

    fun addMessage(message: Message, idMessage: Int) {
        messagesChat.add(message)
    }

    fun addThreadMessage(childMessage: ChildMessage, parentMessageId: Int, idMessage: Int) {
        messagesChat.add(childMessage)
    }

    fun printChat() {
    }
}

open class Message(
    val text: String,
    val idMessage: Int,
    val authorId: Int,
) : Chat()

class ChildMessage(
    text: String,
    idMessage: Int,
    authorId: Int,
    val parentMessageId: Int,
) : Message(text, idMessage, authorId)