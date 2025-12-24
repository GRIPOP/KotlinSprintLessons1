package org.example.app.lesson_14

import kotlin.math.PI
import java.util.Locale

const val WHITE = "Белый"
const val BLACK = "Черный"

fun main() {
    val blackCircle = Circle(BLACK, 10)
    val whiteCircle = Circle(WHITE, 50)
    val blackRectangle = Rectangle(BLACK, 10, 10)
    val whiteRectangle = Rectangle(WHITE, 5, 5)
    val figure: List<Figure> = listOf(blackCircle, whiteCircle, blackRectangle, whiteRectangle)
    val sumPerimeterBlackFigure = figure.filter { it.colour == BLACK }.sumOf { it.calculatePerimeter() }
    val sumAreaWhiteFigure = figure.filter { it.colour == WHITE }.sumOf { it.calculateArea() }

    println("Сумма площадей всех белых фигур равна: ${String.format(Locale.US, "%.2f", sumAreaWhiteFigure)}")
    println("Сумма периметров всех черных фигур равна: ${String.format(Locale.US, "%.2f", sumPerimeterBlackFigure)}")
}

abstract class Figure(
    val colour: String,
) {
    abstract fun calculateArea(): Double
    abstract fun calculatePerimeter(): Double
}

class Circle(
    colour: String,
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
    colour: String,
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