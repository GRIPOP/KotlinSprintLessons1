package org.example.app.lesson_16

fun main() {
    val order = Order(123)
    println(order.status)
    order.requestChangeStatus("Готов")
    println(order.status)
}

class Order(val number: Int, var status: String = "Не готов") {

    fun requestChangeStatus(newStatus: String) {
        status = newStatus
        changeStatus()
    }

    private fun changeStatus() {
        println("Новый статус заказ: $status")
    }
}