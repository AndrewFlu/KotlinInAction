package ch_08_basic_types_collections_arrays.kotlin_java

fun printInUppercase(list: List<String>) { // параметр объявлен с НЕИЗМЕНЯЕМЫМ типом коллекции (List)
    println(CollectionUtils.uppercaseAll(list)) // вызов функции Java, которая изменяет коллекцию
    println(list.first()) // докажем, что коллекция, которая не должна была измениться - изменилась
}

fun main() {
    val list = listOf("a", "b", "c")
    printInUppercase(list)
}