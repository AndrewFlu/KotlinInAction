package ch_06_collections.zip

fun main() {
    val names = listOf("Nastya", "Olga K.", "Olga O.", "Zhenya")
    val sizes = listOf(2, 3, 0, 1, 2)

    println("girls sizes: ${names zip sizes}")
    val zipped = names.zip(sizes) { a, b -> "name: $a, upper size $b" }
    println(zipped)

    val ages = listOf(35, 35, 39, 37)
    println(names zip sizes zip ages)
}