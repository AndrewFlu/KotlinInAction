package ch_06_collections.predicates

import ch_05_lambdas.method_references.Person

fun main() {
    // predicate
    val powerFullClub = { carOwner: CarOwner -> carOwner.engineVolume >= 2.0 }

    val carOwners = listOf(
        CarOwner("Yuran", "BMW X6", 4.4),
        CarOwner("Zhenya", "Geely Atlas Pro", 1.5),
        CarOwner("Andrew", "BMW 1", 2.0),
    )

    println("В клубе: ${carOwners.filter(powerFullClub)}")
    println("Не в клубе: ${carOwners.filterNot(powerFullClub)}")

    // Объявление деструктуризации разобъёт возвращаемую пару списков
    // на две переменные на основе логического предиката
    val (insiders, outsiders) = carOwners.partition(powerFullClub)
    println("В клубе: ${insiders.map(CarOwner::name)}")
    println("Не в клубе: ${outsiders.map(CarOwner::name)}")
}