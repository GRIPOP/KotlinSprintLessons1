package org.example.app.lesson_11

fun main() {
    val user: User2 = User2(1, "ranger", "user", "ranger@mail.ru")
    user.changePassword()
    user.writeBio()
    user.userInfo()
}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {

    fun userInfo() {
        println(id)
        println(login)
        println(password)
        println(email)
        println(bio)
    }

    fun writeBio() {
        print("Введите новые данные для bio: ")
        bio = readln()
    }

    fun changePassword() {
        print("Введите пароль: ")
        if (readln() == password) {
            print("Введите новый пароль: ")
            password = readln()
            println("Пароль был изменён")
        }
        else {
            println("Введен неверный пароль")
        }
    }
}