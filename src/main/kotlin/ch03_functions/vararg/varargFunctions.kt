package ch03_functions.vararg

fun main(args: Array<String>) {
    val list = listOf("Entered: ", *args ) // оператор *(спрэд) распаковывает содержимое массива
    println(list)
}

