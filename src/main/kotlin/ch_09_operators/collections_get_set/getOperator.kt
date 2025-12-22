package ch_09_operators.collections_get_set

import ch_09_operators.equals.Point

operator fun Point.get(index: Int): Int {
    return when(index) {
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}
fun main() {
    val p = Point(10, 20)
    println(p[0]) // получаем координату 'x' с помощью индексного оператора доступа
    println(p[1]) // получаем координату 'y' с помощью индексного оператора доступа
}