package ch_06_collections.sequence

import ch_05_lambdas.method_references.Person

fun main() {
    val peolpe = listOf(
        Person("Robert", 67),
        Person("Mike", 67),
        Person("Kim", 57),
        Person("Andrew", 37),
        Person("Zhenya", 38),
        Person("Alex", 47)
    )

    // неоптимальная реализация:
    // map() выполняется перед filter()
    println(
        peolpe
            .asSequence()
            .map { it.name }
            .filter { it.length < 4 }
            .toList()
    )

    // более производительная последовательность:
    // сначала элементы фильтруются, а к оставшимся применяется функция map()
    println(peolpe
        .asSequence()
        .filter { it.name.length < 4 }
        .map { it.name }
        .toList()
    )
}
