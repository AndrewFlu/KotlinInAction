package ch_08_basic_types_collections_arrays.primitives

fun main() {
    println("5".toInt())
    println("four".toIntOrNull())
    println("TRUE".toBoolean())
    println("tru".toBoolean())
    println("".toBoolean())
    println(null.toBoolean())
    println("true".toBooleanStrict())
    println("false".toBooleanStrict())
    println("TRUE".toBooleanStrict()) // выбросит исключение, т.к. допускаются только 'true' и 'false'
}