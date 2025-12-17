package ch_08_basic_types_collections_arrays.list

fun readNumbers1(text: String): List<Int?> {
    val result = mutableListOf<Int?>()
    for (str in text.lineSequence()) {
        val numberOrNull = str.toIntOrNull()
        result.add(numberOrNull)
    }

    return result
}

fun readNumbers2(text: String): List<Int?> = text.lineSequence().map { it.toIntOrNull() }.toList()

fun addValidNumbers(numbers: List<Int?>) {
    var sumOfValidNumbers = 0
    var invalidNumbers = 0
    for (digit in numbers) {
        if (digit != null)
            sumOfValidNumbers += digit
        else
            invalidNumbers++
    }

    println("Sum of valid numbers: $sumOfValidNumbers")
    println("Invalid numbers count: $invalidNumbers")
}

fun main() {
    val input = """
        1
        2
        55
        yo
    """.trimIndent()

    println("readNumbers1(): ${readNumbers1(input)}")
    println("readNumbers2(): ${readNumbers2(input)}")
    println()
    addValidNumbers(readNumbers1(input))
}