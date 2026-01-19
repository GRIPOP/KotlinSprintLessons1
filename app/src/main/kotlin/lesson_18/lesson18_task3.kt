package org.example.app.lesson_18

fun main() {
    val arrayAnimal: MutableList<Animal> = mutableListOf()
    val fox: Animal = Fox("Лиса", "ягоды")
    arrayAnimal.add(fox)
    val dog: Animal = Dog("Собака", "кости")
    arrayAnimal.add(dog)
    val cat: Animal = Cat("Кошка", "рыбу")
    arrayAnimal.add(cat)

    arrayAnimal.forEach { println(it.eat()) }
}

abstract class Animal(val name: String, val food: String) {

    open fun eat(): String = "$name -> ест $food"
    open fun sleep(): String = "$name -> спит"
}

class Fox(name: String, food: String) : Animal(name, food)

class Dog(name: String, food: String) : Animal(name, food)

class Cat(name: String, food: String) : Animal(name, food)