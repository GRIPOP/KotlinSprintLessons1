package org.example.app.lesson_18

fun main() {
    val item = Items(1)
    println(item.printInfoOrder("Ring"))

    val item2 = Items(2)
    println(item2.printInfoOrder(listOf("Bread", "Cheese", "Oil")))
}

class Items(val numberOrder: Int) {

    fun printInfoOrder(item: String): String {
        return "Заказан товар: $item"
    }

    fun printInfoOrder(items: List<String>): String {
        return "Заказаны следующие товары: ${items.joinToString(", ")}"
    }
}