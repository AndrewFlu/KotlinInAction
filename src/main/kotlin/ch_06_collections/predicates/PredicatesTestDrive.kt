package ch_06_collections.predicates

data class CarOwner(val name: String, val auto: String, val engineVolume: Double)

fun main() {
    // predicate
    val powerFullClub = { carOwner: CarOwner -> carOwner.engineVolume >= 2.0 }

    val carOwners = listOf(
        CarOwner("Yuran", "BMW X6", 4.4),
        CarOwner("Zhenya", "Geely Atlas Pro", 1.5),
        CarOwner("Andrew", "BMW 1", 2.0),
    )

    println("В клуб объёмных машин входят все? : ${carOwners.all(powerFullClub)}")
    println("Кто-нибудь входит в клуб объёмных машин? : ${carOwners.any(powerFullClub)}")
    println("Никто не входит в клуб объёмных машин? : ${carOwners.none(powerFullClub)}")
    println("Один человек, кто входит в клуб объёмных машин : ${carOwners.find(powerFullClub)?.name}")

    println("Все, кто входит в клуб объёмных машин : ${carOwners.filter(powerFullClub).map(CarOwner::name)}")

}