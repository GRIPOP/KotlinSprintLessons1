package org.example.app.lesson_16

//Создай класс, описывающий заказ в интернет-магазине.
//В заказе должны быть номер заказа и статус готовности.
//Номер заказа должен быть недоступен для изменения.
//
//Создай метод, который меняет статус заказа.
//Поменять статус заказа можно только отправив заявку менеджеру.
//Имитируй это действие отдельной публичной функцией.
//Она будет принимать новый статус и обращаться к внутреннему методу класса для изменения статуса.

fun main() {
    val order = Order(123)

    println("Старый статус заказа: ${order.status}")
    order.changeStatus()
    println("Новый статус заказа: ${order.status}")

}

class Order(private val number: Int, var status: String = "Не готов") {

    fun changeStatus() {
        print("Введите новый статус: ")
        status = checkNewStatus()
    }
}

fun checkNewStatus(newStatus: String = readln()): String {
    return newStatus
}