package ch_09_operators.plus

data class Point(val x: Int, val y: Int)

operator fun Point.plus(other: Point): Point {
    return Point((x + other.x), (y + other.y))
}

fun main() {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1.plus(p2)) // как вызов функции
    println(p1 + p2) // как вызов оператора +
}