package ch_10_higher_order_functions

data class Bike(val brand: String, val model: String)

fun findSportster(bikes: List<Bike>) {
    bikes.forEach(fun (bike) { // использование анонимной функции вместо лямбды
        if (bike.brand == "Harley-Davidson" && bike.model.contains("Sportster")) {
            println("Sporster found!")
            return // относится к ближайшей функции — анонимной
        }
        println("$bike is not a Sportster")
    })
}

fun main () {
    val bikes = listOf(
        Bike("Suzuki", "Bandit 750"),
        Bike("Harley-Davidson" , "V-Rod"),
        Bike("Harley-Davidson" , "Sportster 1200"),
        Bike("Honda", "CB-400"),
        Bike("Harley-Davidson" , "Sportster 800"),
    )
    findSportster(bikes)
}