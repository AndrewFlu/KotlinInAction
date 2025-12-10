package ch_05_lambdas.with_also_apply

fun alphabet(): String {
    val result = StringBuilder()
    for (letter in 'a'..'z') {
        result.append(letter)
    }
    result.append("\nThis is English alphabet!\n")
    return result.toString()
}

fun main() {
    println(alphabet())
}