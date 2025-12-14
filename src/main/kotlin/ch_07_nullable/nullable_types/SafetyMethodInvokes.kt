package ch_07_nullable.nullable_types

fun printAllCaps(str: String?) {
    val uppercase = str?.uppercase()
    println(uppercase)
}

fun main() {
    printAllCaps("macbook")
    printAllCaps(null)
}