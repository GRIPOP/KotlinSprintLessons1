package org.example.app.lesson_15

fun main() {
    val userAdmin = Admin("Admin1")
    userAdmin.deleteUser()
    userAdmin.deleteMessage()

    val user = OrdinaryUser("User1")
    user.readForum()
    user.writeMessage()
}

abstract class User() {
    abstract val name: String
    open fun deleteUser() {}
    open fun deleteMessage() {}
    open fun readForum() {}
    open fun writeMessage() {}
}

class Admin(override val name: String) : User() {

    override fun deleteUser() = println("$name удалил пользователя")
    override fun deleteMessage() = println("$name удалил сообщение")
}

class OrdinaryUser(override val name: String) : User() {

    override fun writeMessage() = println("$name пишет сообщение")
    override fun readForum() = println("$name читает форум")
}
