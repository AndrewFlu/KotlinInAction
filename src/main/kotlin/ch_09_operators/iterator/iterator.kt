package ch_09_operators.iterator

import java.time.LocalDate

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
    // этот объект реализует интерфейс Iterator для элементов класса LocalDate
    object : Iterator<LocalDate> {
        var current = start

        override fun hasNext(): Boolean =
            current <= endInclusive // соглашение compareTo ( <= ) используется для сравнения дат

        override fun next(): LocalDate {
            val thisDate = current
            current = current.plusDays(1) // инкремент текущей даты на 1 день
            return thisDate // возврат проинкрементированной даты
        }
    }

fun main() {
    val newYear = LocalDate.ofYearDay(2025, 11)
    val daysOff = newYear.minusDays(11)..newYear
    for (dayOff in daysOff) {
        println(dayOff) // итерация по коллекции daysOff, если доступна соответствующая функция-итератор
    }
}