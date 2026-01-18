package org.example.app.lesson_19

fun main() {
    val shirt = Product("Рубашка", 1, Category.CLOTHING).apply { printInfoProduct() }
    val pen = Product("Ручка", 2, Category.STATIONERY).apply { printInfoProduct() }
    val bag = Product("Сумка", 3, Category.OTHER).apply { printInfoProduct() }
}

enum class Category {
    CLOTHING,
    STATIONERY,
    OTHER;

    fun printName() = when (this) {
        CLOTHING -> "Одежда"
        STATIONERY -> "Канцелярские товары"
        else -> "Разное"
    }
}

class Product(val name: String, val id: Int, val category: Category) {

    fun printInfoProduct() {
        println("Название: $name, id: $id, Категория: ${category.printName()}")
    }
}