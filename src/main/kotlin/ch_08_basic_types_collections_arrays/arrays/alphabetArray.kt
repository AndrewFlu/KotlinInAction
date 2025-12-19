package ch_08_basic_types_collections_arrays.arrays

fun main() {
    val letters = Array(26) {index -> ('a' + index).toString()}
    println(letters.joinToString(""))
}