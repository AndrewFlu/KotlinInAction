package ch_09_operators.binary_assign

import ch_09_operators.binary.Point
import ch_09_operators.binary.plus

fun main() {
    var point = Point(1, 2)
    point += Point(5,6)

    println(point)
}