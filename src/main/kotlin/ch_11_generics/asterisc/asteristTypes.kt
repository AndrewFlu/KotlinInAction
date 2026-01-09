package ch_11_generics.asterisc

import kotlin.random.Random

fun main() {
    val listOfAnyTypes: MutableList<Any?> = mutableListOf('z', 2, "abc")
    val chars = mutableListOf('a', 'b', 'c')
    val unknownElements: MutableList<*> =
        if (Random.nextBoolean())
            listOfAnyTypes
        else
            chars
    println(unknownElements.first())
//    unknownElements.add(42) // добавить Int нельзя
}