package ch_09_operators.`in`

import ch_09_operators.equals.Point

data class Rectangle(val topLeft: Point, val bottomRight: Point)

operator fun Rectangle.contains(point: Point) : Boolean {
    return point.x in topLeft.x..< bottomRight.x &&
            point.y in topLeft.y..< bottomRight.y // оператор '..<' для открытого диапазона (не включает границу)
}

fun main() {
    val rect = Rectangle(Point(10, 20), Point(50, 50))
    println(Point(20, 30) in rect)
    println(Point(5, 5) in rect)
}