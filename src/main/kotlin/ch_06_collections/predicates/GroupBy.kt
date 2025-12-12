package ch_06_collections.predicates

data class PetrolHead(val name: String, val car: String)

fun main() {
    val carOwners = listOf(
        PetrolHead("Juran", "BMW"),
        PetrolHead("Zhenya", "Geely"),
        PetrolHead("Ilya", "Toyota"),
        PetrolHead("Andrew", "BMW"),
        PetrolHead("Alex", "BMW"),
    )
    println(carOwners.groupBy { it.car })

    println()

    val fruits = listOf("apple", "apricot", "banana", "coconat", "cherry", "blueberry")
    println(fruits.groupBy ( String::first ))

}