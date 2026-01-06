package ch_11_generics.type_erasure

fun readNumbersOrWords(): List<Any> {
    val input = readln()
    val words: List<String> = input.split(",")
    val numbers: List<Int> = words.mapNotNull{it.toIntOrNull()}

    return numbers.ifEmpty { words }
}

fun printList(list: List<Any>) {
    when(list) {
        // Ошибка: невозможно проверить экземпляр стёртого типа
//        is List<String> -> println("Strings: $list")
//        is List<Int> -> println("Ints: $list")
    }
}

fun main() {
    val list = readNumbersOrWords()
    printList(list)
}