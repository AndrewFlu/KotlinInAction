package ch_08_basic_types_collections_arrays.arrays

fun main() {
    val strings = listOf("a", "b", "c")
    // оператор * (спрэд) требуется для передачи массива, когда ожидается vararg
    println("/%s/%s/%s".format(*strings.toTypedArray()))
}