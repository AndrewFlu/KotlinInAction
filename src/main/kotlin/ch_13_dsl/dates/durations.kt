package ch_13_dsl.dates

import kotlin.time.Clock
import kotlin.time.Duration
import kotlin.time.Duration.Companion.days
import kotlin.time.DurationUnit
import kotlin.time.ExperimentalTime
import kotlin.time.toDuration

val Int.customDays: Duration
    get() = this.toDuration(DurationUnit.DAYS)

val Int.customHours: Duration
    get() = this.toDuration(DurationUnit.HOURS)
val Int.fortNight: Duration
    get() = (this * 14).toDuration(DurationUnit.DAYS)

@OptIn(ExperimentalTime::class)
fun main () {
    val now = Clock.System.now()
    val yesterday = now - 1.customDays
    val later = now + 5.customDays
    val fortnight = now + 1.fortNight

    println("now: $now")
    println("yesterday: $yesterday")
    println("later: $later")
    println("fortnight: $fortnight")
}