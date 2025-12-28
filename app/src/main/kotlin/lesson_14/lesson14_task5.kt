package org.example.app.lesson_14

fun main() {
    val chat = Chat()
    chat.addMessage("Hello", "User1")
    chat.addMessage("adsadasdad", "User2")
    chat.addThreadMessage("Bye", "User3", 1)
    chat.addThreadMessage("asdas", "User4", 1)
    chat.addThreadMessage("adsa", "User5", 2)
    chat.addThreadMessage("adsada", "User6", 2)

    chat.printChat()
}

class Chat() {

    var messagesChat: MutableList<Message> = mutableListOf()
    var idMessage: Int = 1

    fun addMessage(text: String, author: String) {
        val message = Message(text, idMessage, author)
        messagesChat.add(message)
        idMessage++
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) {
        val childMessage = ChildMessage(text, idMessage, author, parentMessageId)
        messagesChat.add(childMessage)
        idMessage++
    }

    fun printChat() {
        messagesChat.forEach { println(it) }
    }

    open class Message(
        val text: String,
        val idMessage: Int,
        val author: String,
    )

    class ChildMessage(
        text: String,
        idMessage: Int,
        author: String,
        val parentMessageId: Int?,
    ) : Message(text, idMessage, author)
}