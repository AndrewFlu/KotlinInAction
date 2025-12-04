package ch04_classes_interfaces.singleton

import ch03_functions.strings.joinToString

data class MacBook(val model: String) {
    object ModelComparator : Comparator<MacBook> {

        // создание внутреннего объекта компаратора
        override fun compare(o1: MacBook, o2: MacBook): Int {
            return o1.model.compareTo(o2.model)
        }
    }
}

fun main() {
    val macBookModels = listOf(
        MacBook("MacBook Air 14"),
        MacBook("MacBook Pro 16 M1 Pro"),
        MacBook("MacBook Pro 14 M1 Pro"),
        MacBook("MacBook Pro 16 M3 Pro"),
        MacBook("MacBook Pro 14 M4"),
    )

    println(macBookModels.sortedWith(MacBook.ModelComparator).joinToString(separator = "\n"))
}