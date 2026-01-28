package org.example.app.lesson_22

fun main() {
    val alphaCentauri = GalacticGuide(
        "Альфа-Центавра",
        """
            ближайшая к Солнечной системе тройная звездная система в созвездии Центавра,
            состоящая из солнцеподобных звезд A и B, а также красного карлика Проксима Центавра
        """.trimIndent(),
        "14.01.2201 14:30:30",
        4.36)
    val namePlaceOrEvent = alphaCentauri.component1()
    val descriptionPlaceOrEvent = alphaCentauri.component2()
    val dateAndTimeEvent = alphaCentauri.component3()
    val distanceFromEarthInLightYears = alphaCentauri.component4()

    println(namePlaceOrEvent)
    println(descriptionPlaceOrEvent)
    println(dateAndTimeEvent)
    println(distanceFromEarthInLightYears)
}

data class GalacticGuide(
    val namePlaceOrEvent: String,
    val descriptionPlaceOrEvent: String,
    val dateAndTimeEvent: String,
    val distanceFromEarthInLightYears: Double,
)
