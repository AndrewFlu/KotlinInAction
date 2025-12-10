package ch_05_lambdas.with_also_apply

fun alphabet_1() = StringBuilder().apply {
    for (letter in 'A'..'Z')
        append(letter)
    append("\nThis is ENGLISH Alphabet\n").toString()
}

fun alphabet_2() = buildString {
    for (letter in 'a'..'z')
        append(letter)
    append("\nThis is ENGLISH Alphabet\n")
}

fun main() {
    println(alphabet_1())
    println(alphabet_2())
}