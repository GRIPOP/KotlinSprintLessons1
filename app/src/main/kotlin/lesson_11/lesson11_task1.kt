package org.example.app.lesson_11

fun main() {
    val user1: User = User(1, "superman", "kryptonite", "superman@google.com")
    val user2: User = User(2, "spider-man", "web", "spiderman@google.com")

    println("Данные для ${user1.login}")
    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.email)

    println() // Для разделение иноформации пользователей

    println("Данные для ${user2.login}")
    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.email)
}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)