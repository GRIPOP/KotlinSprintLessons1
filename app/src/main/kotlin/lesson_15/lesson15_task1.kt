package org.example.app.lesson_15
//В мобильной игре есть разные существа. Напиши интерфейсы для летающих и плавающих существ.
//
//- создай интерфейсы с методами передвижения для: карась, чайка, утка;
//- создай для каждого существа классы, реализующие соответствующие интерфейсы;
//- выведи сообщения в консоль, о том как они могут передвигаться.

fun main() {
    val crucianCarp = CrucianCarp()
    crucianCarp.swim()

    val seagull = Seagull()
    seagull.fly()

    val duck = Duck()
    duck.swim()
    duck.fly()
}

interface SwimmingAnimal {
    fun swim()
}

interface FlyingAnimal {
    fun fly()
}

class CrucianCarp(): SwimmingAnimal {
    override fun swim() {
        println("Карась плавает")
    }
}

class Seagull(): FlyingAnimal {
    override fun fly() {
        println("Чайка летает")
    }
}

class Duck(): SwimmingAnimal, FlyingAnimal {
    fun moveDuck() {

    }
    override fun fly() {
        println("Утка летает")
    }

    override fun swim() {
        println("Утка плавает")
    }
}