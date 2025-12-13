package ch_06_collections.flatten

data class PetrolHead(val name: String, val automobiles: List<String>)

val carOwnerLibrary = listOf(
    PetrolHead("Juran", listOf("BMW X6 E71")),
    PetrolHead("Andrew", listOf("Renault Logan", "BMW 1er E81")),
    PetrolHead("Petruha", listOf("VAZ 2108", "Subaru Impreza", "Land Rover Range Rover Vogue", "Toyota Celica", "Nissan Pathfinder"))
)

fun main() {
    println(carOwnerLibrary.map { it.automobiles })
    println(carOwnerLibrary.flatMap { it.automobiles })
}