package org.example.app.lesson_14

fun main() {
    val sputnik1 = Sputnik("Спутник1", true)
    val sputnik2 = Sputnik("Спутник2", false)
    val planet1 = Planet("Планета1", true, listOf(sputnik1, sputnik2))

    planet1.also {
        println(it.name)
        it.sputniks.forEach { sputnik -> println(sputnik.name) }
    }
}

abstract class SkyBody(
    val name: String,
    val isAtmosphere: Boolean,
)

class Planet(
    name: String,
    isAtmosphere: Boolean,
    val sputniks: List<Sputnik>,
) : SkyBody(name, isAtmosphere)

class Sputnik(
    name: String,
    isAtmosphere: Boolean,
) : SkyBody(name, isAtmosphere)