package ch_05_lambdas.with_also_apply

fun alphabet_1() = StringBuilder().apply {
    for (letter in 'A'..'Z')
        append(letter)
    append("\nThis is ENGLISH Alphabet\n").toString()
}

fun main() {
    println(alphabet_1())
}