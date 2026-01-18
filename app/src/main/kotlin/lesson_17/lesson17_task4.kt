package org.example.app.lesson_17

fun main() {
    val packet = PostalParcel(1, "Moscow")
    packet.location = "Kazan"
    println(packet.count)
}

class PostalParcel(
    val number: Int,
    location: String,
) {
    var count = 0
    var location: String = location
        set(value) {
            field = value
            count++
        }
}