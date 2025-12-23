package org.example.app.lesson_14

import kotlin.math.PI
import java.util.Locale

fun main() {
    var sumPerimeterBlackFigure: Double = 0.0
    var sumAreaWhiteFigure: Double = 0.0
    val blackCircle = Circle("Черный", 10)
    val whiteCircle = Circle("Белый", 50)
    val blackRectangle = Rectangle("Черный", 10, 10)
    val whiteRectangle = Rectangle("Белый", 5, 5)
    val figure: List<Figure> = listOf(blackCircle, whiteCircle, blackRectangle, whiteRectangle)

    figure.forEach {
        when {
            it.colour == "Белый" -> sumAreaWhiteFigure += it.calculateArea()
            it.colour == "Черный" -> sumPerimeterBlackFigure += it.calculatePerimeter()
        }
    }

    println("Сумма площадей всех белых фигур равна: ${String.format(Locale.US, "%.2f", sumAreaWhiteFigure)}")
    println("Сумма периметров всех черных фигур равна: ${String.format(Locale.US, "%.2f", sumPerimeterBlackFigure)}")
}

abstract class Figure(
    open val colour: String,
) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(
    override val colour: String,
    val radius: Int,
) : Figure(
    colour = colour,
) {

    override fun calculateArea(): Double {
        return PI * radius * radius
    }

    override fun calculatePerimeter(): Double {
        return 2 * radius * PI
    }
}

class Rectangle(
    override val colour: String,
    val width: Int,
    val height: Int,
) : Figure(
    colour = colour
) {

    override fun calculateArea(): Double {
        return width * height.toDouble()
    }

    override fun calculatePerimeter(): Double {
        return (2 * (width + height)).toDouble()
    }
}