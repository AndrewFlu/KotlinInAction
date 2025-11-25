package ch02.loops

fun main() {
    // prepare map
    val charToBinaryMap = mutableMapOf<Char, String>()
    for (key in 'A'..'F') {
        val binary =
            key.code.toString(radix = 2)
        charToBinaryMap[key] = binary
    }
    // print map
    for ((char, binary) in charToBinaryMap)
        println("$char — $binary")

}