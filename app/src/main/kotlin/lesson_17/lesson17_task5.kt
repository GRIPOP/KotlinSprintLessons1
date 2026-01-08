package org.example.app.lesson_17

fun main() {
    val user = User("login", "123123123")
    user.password = "1234"
    println(user.password)
    user.login = "LOGIN"
    println(user.login)
}

class User(login: String, password: String) {
    var password: String = password
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль!")
        }

    var login: String = login
        set(value) {
            field = value
            println("Логин успешно изменен!")
        }
}

