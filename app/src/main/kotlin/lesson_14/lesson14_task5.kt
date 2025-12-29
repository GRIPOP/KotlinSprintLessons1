package org.example.app.lesson_14

fun main() {
    val chat = Chat()
    chat.addMessage("MES1", "User1")
    chat.addMessage("MES2", "User2")
    chat.addMessage("MES3", "User8")
    chat.addMessage("MES4", "User9")

    chat.addThreadMessage("MES1.1", "User3", 1)
    chat.addThreadMessage("MES1.2", "User4", 1)
    chat.addThreadMessage("MES2.1", "User5", 2)
    chat.addThreadMessage("MES2.2", "User6", 2)

    chat.printChat()
}

class Chat {
    val messagesChat: MutableList<Message> = mutableListOf()
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
        val parentMessage = messagesChat.filter { it !is ChildMessage }

        for (parent in parentMessage) {
            println(parent.text)
            for (child in messagesChat.filterIsInstance<ChildMessage>()
                .filter { it.parentMessageId == parent.idMessage }) {
                println("\t${child.text}")
            }
        }
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
        val parentMessageId: Int,
    ) : Message(text, idMessage, author)
}