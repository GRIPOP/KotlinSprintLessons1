package org.example.app.lesson_10

const val LOGIN = "admin"
const val PASSWORD = "admin"
const val LENGTH_TOKEN = 32

fun main() {
    val resultGenerateToken = authorization(readln(), readln())
    getBasket(resultGenerateToken)
}

fun authorization(userLogin: String, userPassword: String): String? {
    if (userLogin == LOGIN && userPassword == PASSWORD) {
        val char = ('a'..'z') + (0..9)
        var token = ""
        for (i in 1..LENGTH_TOKEN) {
            token += char.random()
        }
        return token
    }
    else {
        return null
    }
}

fun getBasket(token: String?) {
    val products = listOf("Печенье", "Молоко", "Хлеб", "Чай")

    if (token != null) {
        println(products.joinToString())
    }
    else {
        println("Авторизация не выполнена!")
    }
}