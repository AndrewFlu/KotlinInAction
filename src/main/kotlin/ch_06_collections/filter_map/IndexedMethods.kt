package ch_06_collections.filter_map

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    // оставить элементы, которые больше 3 и индекс которых является чётным числом
    val filtered = numbers.filterIndexed { index, element ->
        index % 2 == 0 && element > 3
    }
    println(filtered)

    val mapped = numbers.mapIndexed{ index, element ->
        index + element
    }
    println(numbers)
    println(mapped)

}