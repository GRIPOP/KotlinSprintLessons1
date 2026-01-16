package org.example.app.lesson_18

fun main() {
    val fox: Animal = Fox("Лиса", "ягоды")
    val dog: Animal = Dog("Собака", "кости")
    val cat: Animal = Cat("Кошка", "рыбу")

    arrayAnimal.forEach { println(it.eat()) }
}

val arrayAnimal: MutableList<Animal> = mutableListOf()

abstract class Animal(val name: String, val food: String) {

    abstract fun eat(): String
    abstract fun sleep(): String

    init {
        arrayAnimal.add(this)
    }
}

class Fox(name: String, food: String) : Animal(name = name, food = food) {

    override fun eat() = "$name -> ест $food"
    override fun sleep() = "$name -> спит"
}

class Dog(name: String, food: String) : Animal(name, food) {

    override fun eat() = "$name -> ест $food"
    override fun sleep() = "$name -> спит"
}

class Cat(name: String, food: String) : Animal(name = name, food = food) {

    override fun eat() = "$name -> ест $food"
    override fun sleep() = "$name -> спит"
}


