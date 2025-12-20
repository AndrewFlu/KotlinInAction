package ch_09_operators.binary_assign

fun main() {
    val autos = mutableListOf("logan", "e81")
    autos += "Q7 UY" // '+=' модифицирует существующий список

    val newAutos = autos + listOf("G01", "A4") // '+' создаёт новый список

    println(autos)
    println(newAutos)
}