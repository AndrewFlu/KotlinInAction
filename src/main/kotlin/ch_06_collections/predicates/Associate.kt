package ch_06_collections.predicates

fun main() {
    val carOwners = listOf(
        CarOwner("Zhenya", "Geely Atlas Pro", 1.5),
        CarOwner("Ilya", "Toyota Camry", 2.0),
        CarOwner("Juran", "BMW X6", 4.4),
        CarOwner("Tsyplenkov", "Geely Atlas Pro", 1.5),
    )
    val carMap = carOwners.associate { carOwner -> carOwner.name to carOwner.auto }
    println(carMap)
    println(carMap["Ilya"])

    println()
    // параметр извлекает значения. Ключами выступают элементы коллекции
    val carAsValueMap = carOwners.associateWith(CarOwner::auto)
    println("associateWith(): $carAsValueMap")
    println()
    // лямбд извлекает ключи. Значениями выступают сами элементы коллекции
    val carAsKeyMap = carOwners.associateBy { it.auto }
    println("associateBy(): $carAsKeyMap")
}