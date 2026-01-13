package org.example.app.lesson_15

fun main() {
    val crucianCarp = CrucianCarp()
    crucianCarp.swim()

    val seagull = Seagull()
    seagull.fly()

    val duck = Duck()
    duck.swim()
    duck.fly()
}

interface AbilitySwim {
    fun swim()
}

interface AbilityFly {
    fun fly()
}

class CrucianCarp() : AbilitySwim {
    override fun swim() {
        println("Карась плавает")
    }
}

class Seagull() : AbilityFly {
    override fun fly() {
        println("Чайка летает")
    }
}

class Duck() : AbilitySwim, AbilityFly {
    override fun fly() {
        println("Утка летает")
    }

    override fun swim() {
        println("Утка плавает")
    }
}