package ch_13_dsl.dates

import kotlin.time.*

val Int.customDays: Duration
    get() = this.toDuration(DurationUnit.DAYS)

val Int.customHours: Duration
    get() = this.toDuration(DurationUnit.HOURS)

@OptIn(ExperimentalTime::class)
fun main() {
    val now = Clock.System.now()
    val yesterday = now - 1.customDays
    val later = now + 5.customDays

    println("now: $now")
    println("yesterday: $yesterday")
    println("later: $later")
}