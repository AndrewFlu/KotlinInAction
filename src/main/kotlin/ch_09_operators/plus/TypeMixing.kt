package ch_09_operators.plus

operator fun Char.times(repeatCount: Int): String {
    return toString().repeat(repeatCount)
}

fun main() {
    println('s' * 5)
}