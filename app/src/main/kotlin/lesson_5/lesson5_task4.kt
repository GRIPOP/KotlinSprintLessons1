package org.example.app.lesson_5

const val CAPITAN_LOGIN = "Zaphod"
const val CAPITAN_PASSWORD = "PanGalactic"

fun main() {
    print("Введите имя пользователя: ")
    val userLogin = readln()

    if (userLogin == CAPITAN_LOGIN) {
        print("Введите пароль: ")
        val userPassword = readln()
        if (userPassword == CAPITAN_PASSWORD) {
            println("""[вздыхает...] Ваши данные проверены, и о, чудо, они верны... 
                |Пользователь "Zaphod", вам разрешено входить на борт корабля "Heart of Gold". 
                |Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов... 
                |[меланхолический вздох...] Надеюсь, вам понравится пребывание здесь больше, чем мне.""".trimMargin())
        }
        else {
            println("Попробуйте ввести пароль снова")
        }
    }
    else {
        println("Пройдите регистрацию")
    }
}