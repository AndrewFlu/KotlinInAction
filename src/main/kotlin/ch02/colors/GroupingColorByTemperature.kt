package ch02.colors

import ch02.colors.Color.*

fun measureColor() = GREEN;

fun getWarmthFromSensor(): String {
    return when (val color = measureColor()) {
        RED, ORANGE, YELLOW -> "warm (red = ${color.r})"
        GREEN -> "neutral (green = ${color.g})"
        BLUE, INDIGO, VIOLET -> "cold (blue = ${color.b})"
    }
}

fun main() {
    println(getWarmthFromSensor())
}