package ch_08_basic_types_collections_arrays.nothing

import ch_07_nullable.nullable_types.Address
import ch_07_nullable.nullable_types.Company

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}

fun main() {
    val moneta = Company("moneta", null)
    val innotech = Company("Innotech", Address("RU", "Moscow", "Lenina", 101000))

    val innotechAddress = innotech.address ?: fail("No address")
    println("Inotech address: $innotechAddress")

    val monetaAddress = moneta.address ?: fail("No address")
    println("Moneta address: $monetaAddress")
}