package ch_09_operators.binary

data class Point(val x: Int, val y: Int)

// перегрузка оператора +
operator fun Point.plus(other: Point): Point {
    return Point((x + other.x), (y + other.y))
}

// перегрузка оператора *
operator fun Point.times(scale: Int): Point {
    return Point((x * scale), (y * scale))
}

fun main() {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    // проверяем оператор +
    println(p1.plus(p2)) // как вызов функции
    println(p1 + p2) // как вызов оператора +

    // проверяем оператор *
    println(p1.times(2)) // как вызов функции
    println(p1 * 2) // как вызов оператора *
}