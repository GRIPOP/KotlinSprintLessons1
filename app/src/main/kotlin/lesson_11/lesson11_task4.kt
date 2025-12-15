package org.example.app.lesson_11

fun main() {
    val category: Category = Category("Бургеры")
    val recept: Recept = Recept("Чизбургер")
    val ingredients: Ingredients = Ingredients(listOf("Фарш", "Сыр", "Соус", "Булочка", "Помидор", "Огурец", "Лук"))
}

class Category(val nameCategory: String) {

}

class Recept(val nameRecept: String) {

}

class Ingredients(val ingredients: List<String>) {

}