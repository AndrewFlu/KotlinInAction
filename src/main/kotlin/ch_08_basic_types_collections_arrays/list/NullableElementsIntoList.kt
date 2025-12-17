package ch_08_basic_types_collections_arrays.list

fun readNumbers1(text: String): List<Int?> {
    val result = mutableListOf<Int?>()
    for (str in text.lineSequence()) {
        val numberOrNull = str.toIntOrNull()
        result.add(numberOrNull)
    }

    return result
}



fun main() {
    val input = """
        1
        2
        55
        yo
    """.trimIndent()

    println("readNumbers1(): ${readNumbers1(input)}")
}