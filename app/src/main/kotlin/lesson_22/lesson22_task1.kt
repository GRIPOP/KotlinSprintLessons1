package org.example.app.lesson_22

fun main() {
    val book = RegularBook("Безмолвный пациент", "Алекс Михаэлидес")
    val book2 = RegularBook("Безмолвный пациент", "Алекс Михаэлидес")

    val book3 = DataBook("1Q84", "Харуки Мураками")
    val book4 = DataBook("1Q84", "Харуки Мураками")

    println(book == book2)
    println(book3 == book4)
    /*
        У нас два случая:
        1) Сравнение объектов обычного класса. 
           Метод equals() сравнивает ссылки на объекты.
           Поэтому на экране мы видим false.
           
        2) Сравнение объектов ДАТА класса. 
           Метод equals() сравнивает объекты по значению их свойств.
           Поэтому на экране мы видим true, так как у этих объектов одинаковые свойства.
    */
}

class RegularBook(val name: String, val author: String)

data class DataBook(val name: String, val author: String)
