package org.example.app.lesson_22

fun main() {
    val firstBook = RegularBookV2("Война и мир", "Толстой Л.Н")
    val secondBook = DataBookV2("Как изобрести все. Создай цивилизацию с нуля", "Райан Норт")

    println(firstBook)
    println(secondBook)

    /*
    Имеет два случая:
    1) Выводим на экран объект firstBook и видим
    текстовое представление объекта не data class такое:
    classorg.example.app.lesson_22.RegularBookV2@12a3a380
    Так как toString для объекта не дата класса имеет вид - (ИмяКласса@ХэшКодВ16_ричнойСистеме)

    2) Выводим на экран объект secondBook и видим
    тестовое представление для объекта дата класса такое:
    DataBookV2(name=Как изобрести все. Создай цивилизацию с нуля, author=Райан Норт)
    Они разные потому что в data class метод toString(который вызывается под капотом println) переопределен.
     */
}

class RegularBookV2(val name: String, val author: String)

data class DataBookV2(val name: String, val author: String)
