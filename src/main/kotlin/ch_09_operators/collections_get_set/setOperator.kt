package ch_09_operators.collections_get_set

data class MutablePoint(var x: Int, var y: Int)

operator fun MutablePoint.set(index: Int, value: Int) {
    when (index) {
        0 -> x = value
        1 -> y = value
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

fun main() {
    val point = MutablePoint(10, 20)
    point[0] = 15 //  устанавливаем новое значение координате 'x'
    point[1] = 150 //  устанавливаем новое значение координате 'y'
    println(point)
}

