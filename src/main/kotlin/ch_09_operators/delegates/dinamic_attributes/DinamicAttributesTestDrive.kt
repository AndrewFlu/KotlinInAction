package ch_09_operators.delegates.dinamic_attributes

fun main() {
    val juran = CanonicalPerson()
    val juranData = mapOf(
        "name" to "Juran",
        "company" to "Moneta",
        "position" to "manager",
        "moto" to "Triumph Thunderbird"
    )
    for ((attributeKey, attributeValue) in juranData)
        juran.setAttribute(attributeKey, attributeValue)

    println("Проверка экземпляра CanonicalPerson:")
    println("${juran.name}, has a motorcycle ${juran.moto}")

    juran.setAttribute("moto", "Harley-Davidson")
    println("${juran.name}, has a motorcycle ${juran.moto}")
}
