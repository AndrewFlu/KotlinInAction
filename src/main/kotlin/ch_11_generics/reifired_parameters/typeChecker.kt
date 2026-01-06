package ch_11_generics.reifired_parameters

inline fun <reified T> isA(testType: Any) = testType is T

fun main() {
    println(isA<Int>("Hello World"))
    println(isA<String>("Hello World"))
}