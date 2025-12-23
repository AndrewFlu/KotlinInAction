package ch_09_operators.destructurization

fun printEntries(map: Map<String, String>) {
    for ((key, value) in map)
        println("$key -> $value")
}

fun main() {
    val map = mapOf("X6" to "BMW", "GLC" to "Mercedes-Benz")
    printEntries(map)

    map.forEach{ (key, value) -> println("$key -> $value") }
}
