package ch_11_generics.reifired_parameters

import ch_07_nullable.platform_types.Person

inline val <reified T> T.canonicalName: String
    get() = T::class.java.canonicalName

fun main() {
    println(listOf(1, 2, 3, 4, 5).canonicalName)
    println(Person("Juran").canonicalName)
}