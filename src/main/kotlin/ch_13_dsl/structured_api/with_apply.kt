package ch_13_dsl.structured_api

fun main() {
    val map = mutableMapOf(1 to "One")

    map.apply { this[2] = "Two" }

    with(map) {this[3] = "Three" }

    println(map)
}