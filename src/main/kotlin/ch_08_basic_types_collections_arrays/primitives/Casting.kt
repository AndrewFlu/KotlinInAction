package ch_08_basic_types_collections_arrays.primitives

fun main() {
    val x = 1
    val list = listOf(1L, 2L, 3L, 4L, 5L)

//    println(x in list) // несовпадение типов
    println(x.toLong() in list)
}