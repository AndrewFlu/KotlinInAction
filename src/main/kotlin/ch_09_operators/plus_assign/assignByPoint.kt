package ch_09_operators.plus_assign

import ch_09_operators.plus.Point
import ch_09_operators.plus.plus

fun main() {
    var point = Point(1, 2)
    point += Point(5,6)

    println(point)
}