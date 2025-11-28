package ch03_functions.inheritance

fun Element.clear() {
    println("Clear Base Element")
}

fun Button.clear() {
    println("Button doesn't support clear command")
}