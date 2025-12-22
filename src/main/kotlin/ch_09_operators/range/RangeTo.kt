package ch_09_operators.range

import java.time.LocalDate

fun main() {
    val now = LocalDate.now()
    val vacation = now..now.plusDays(10) // создание 10 дневного диапазона начиная с данного момента
    println(now.plusWeeks(1) in vacation) // проверка, принадлжит ли дата заданному диапазону
}