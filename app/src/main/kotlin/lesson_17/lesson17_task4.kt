package org.example.app.lesson_17

fun main() {
    val packet = Package(1, "Moscow")
    packet.location = "Kazan"
    println(packet.count)
}

class Package(
    val number: Int,
    location: String = "Distribution point",
) {
    var count = 0
    var location = location
        set(value) {
            count++
        }

    init {
        count++
    }
}