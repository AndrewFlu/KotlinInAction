package ch_06_collections.sequence

fun main() {
    val naturalNumbers = generateSequence(0) { it + 1 } // отложенная операция Sequence
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 } // отложенная операция Sequence
    val sum = numbersTo100.sum() // все отложенные операции выполняются после получения результата функции sum()

    println(sum)
}