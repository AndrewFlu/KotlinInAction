package ch_11_generics.type_alias

typealias ComputerCombiner = (String, String, String, String) -> String

val windowsCombiner: ComputerCombiner = { a, b, c, d -> "ПК на Windows: " +
        "\nCPU: $a" +
        "\nBoard: $b" +
        "\nRAM: $c Gb" +
        "\nHDD: $d Gb"}

fun combineComputerParts(combiner: ComputerCombiner) {
    println(combiner("Intel i7 14700 KF", "Asus Z690", "Patriot 64", "Kingston 1000"))
}

fun main() {
    combineComputerParts(windowsCombiner)
    combineComputerParts({ a, b, c, d -> "MacBook Pro 16: $a, $b" })
}