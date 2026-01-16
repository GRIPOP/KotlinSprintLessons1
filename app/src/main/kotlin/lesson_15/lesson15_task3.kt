package org.example.app.lesson_15

fun main() {
    val user = OrdinaryUser("User1")
    user.readForum()
    user.writeMessage()

    val userAdmin = Admin("Admin1")
    userAdmin.readForum()
    userAdmin.deleteMessage()
    userAdmin.deleteUser()
}

abstract class User(val name: String) {

    open fun writeMessage() = println("$name пишет сообщение")
    open fun readForum() = println("$name читает форум")

}

class Admin(name: String) : User(name) {

    fun deleteUser() = println("$name удалил пользователя")
    fun deleteMessage() = println("$name удалил сообщение")
}

class OrdinaryUser(name: String) : User(name)
