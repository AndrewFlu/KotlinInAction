package ch_11_generics.boundaries

fun <T : Comparable<T>> max(first: T, second: T): T {
    return if (first > second) first else second
}

fun main() {
    println(max(5, 25))
    println(max("C#", "Java"))
    println(max("a", "ab"))
    println(max("ac", "abc"))
}