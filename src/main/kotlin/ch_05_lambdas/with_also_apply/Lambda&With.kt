package ch_05_lambdas.with_also_apply

fun alphabet(): String {
    val result = StringBuilder()
    for (letter in 'a'..'z') {
        result.append(letter)
    }
    result.append("\nThis is English alphabet!\n")
    return result.toString()
}

fun alphabetBasedOnLambda(): String {
    val result = StringBuilder()
    return with(result) {
        for (letter in 'A'..'Z')
            this.append(letter)
        this.append("\nThis is ENGLISH Alphabet\n")
        this.toString()
    }
}

fun alphabetBasedOnModernLambda(): String {
    val builder = StringBuilder()
    return with(builder) {
        for (letter in 'A' .. 'Z')
            append(letter)
        append("\nThis is ENGLISH Alphabet\n")
        toString()
    }
}

fun main() {
    println(alphabet())
    println(alphabetBasedOnLambda())
    println(alphabetBasedOnModernLambda())
}