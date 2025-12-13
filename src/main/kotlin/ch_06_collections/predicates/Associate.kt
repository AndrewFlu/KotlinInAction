package ch_06_collections.predicates

fun main() {
    val carOwners = listOf(
        CarOwner("Zhenya", "Geely Atlas Pro", 1.5),
        CarOwner("Ilya", "Toyota Camry", 2.0),
        CarOwner("Juran", "BMW X6", 4.4)
    )
    val carMap = carOwners.associate { carOwner -> carOwner.name to carOwner.auto }
    println(carMap)
    println(carMap["Ilya"])
}