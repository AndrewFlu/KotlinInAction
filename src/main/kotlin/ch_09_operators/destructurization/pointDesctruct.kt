package ch_09_operators.destructurization

class Point(val x: Int, val y: Int) {
    operator fun component1() = x
    operator fun component2() = y
}

fun main() {
    val p = Point(10, 20)
    val (x, y) = p
    println(x)
    println(y)
}