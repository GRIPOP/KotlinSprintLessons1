package org.example.app.lesson_18

fun main() {
    val square = Screen()
    println(square.drawSquare(10.0f, 5.0f, 3))
}

class Screen() {

    fun drawCircle(x: Int, y: Int, radius: Int): String {
        return "Нарисован круг в координатах ($x, $y) с радиусом $radius"
    }

    fun drawCircle(x: Float, y: Float, radius: Int): String {
        return "Нарисован круг в координатах ($x, $y) с радиусом $radius"
    }

    fun drawSquare(x: Int, y: Int, side: Int): String {
        return "Нарисован квадрат в координатах ($x, $y) со стороной $side"
    }

    fun drawSquare(x: Float, y: Float, side: Int): String {
        return "Нарисован квадрат в координатах ($x, $y) со стороной $side"
    }

    fun drawDot(x: Int, y: Int): String {
        return "Нарисована точка с координатами ($x, $y)"

    }

    fun drawDot(x: Float, y: Float): String {
        return "Нарисована точка с координатами ($x, $y)"
    }
}