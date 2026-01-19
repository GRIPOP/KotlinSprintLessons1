package org.example.app.lesson_19

fun main() {
    val shirt = Product("Рубашка", 1, Category.CLOTHING)
    shirt.printInfoProduct()

    val pen = Product("Ручка", 2, Category.STATIONERY)
    pen.printInfoProduct()

    val bag = Product("Сумка", 3, Category.OTHER)
    bag.printInfoProduct()
}

enum class Category {
    CLOTHING,
    STATIONERY,
    OTHER;

    fun displayName() = when (this) {
        CLOTHING -> "Одежда"
        STATIONERY -> "Канцелярские товары"
        else -> "Разное"
    }
}

class Product(val name: String, val id: Int, val category: Category) {

    fun printInfoProduct() {
        println("Название: $name, id: $id, Категория: ${category.displayName()}")
    }
}