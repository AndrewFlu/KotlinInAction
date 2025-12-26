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

    println()

    val zhenya = DelegatedPerson()
    val zhenyaData = mapOf(
        "name" to "Zhenya",
        "auto" to "Geely"
    )
    for ((key, value) in zhenyaData)
        zhenya.setAttribute(key, value)

    println("Проверка экземпляра DelegatedPerson:")
    println("${zhenya.name}, has a auto ${zhenya.auto}")
    println("${zhenya.name}, has a moto ${zhenya.moto}") // исключение. Как сделать значение по умолчанию?
}
