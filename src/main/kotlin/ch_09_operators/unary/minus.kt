package ch_09_operators.unary

import ch_09_operators.binary.Point

operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
} 

fun main() {
    val p = Point(5, 1)
    println(-p)
}