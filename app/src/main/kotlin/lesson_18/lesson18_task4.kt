package org.example.app.lesson_18

fun main() {
    val rectangularBox: BoxForPackage = RectangularBox(5, 5, 5)
    println(rectangularBox.countTheVolume())

    val cubicBox: BoxForPackage = CubicBox(3)
    println(cubicBox.countTheVolume())
}

abstract class BoxForPackage {
    abstract fun countTheVolume(): Int
}

class RectangularBox(val length: Int, val width: Int, val height: Int) : BoxForPackage() {
    override fun countTheVolume() = length * width * height
}

class CubicBox(val side: Int) : BoxForPackage() {
    override fun countTheVolume(): Int = side * side * side
}