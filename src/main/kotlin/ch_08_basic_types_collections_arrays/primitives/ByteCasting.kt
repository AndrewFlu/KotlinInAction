package ch_08_basic_types_collections_arrays.primitives

fun printALong(digit: Long) = println(digit)

fun main() {
    val b: Byte = 25 // постоянное значение приобретает правильный тип
    val l = b + 1L // оператор + работает с типами Byte и Long
    printALong(l)
    printALong(42) // компилятор интерпретирует число 42 как тип Long
}