package ch02_language_basis.numbers

fun evaluate(e: Expression): Int =
    when (e) {
        is Number -> e.value
        is Summarized -> evaluate(e.left) + evaluate(e.right)
        else -> throw IllegalArgumentException("Unknown Expression")
    }

fun evaluateWithLogging(e: Expression): Int =
    when (e) {
        is Number -> {
            println("Number: ${e.value}")
            e.value
        }

        is Summarized -> {
            val leftResult = evaluateWithLogging(e.left)
            val rightResult = evaluateWithLogging(e.right)
            println("sum: $leftResult + $rightResult")
            leftResult + rightResult
        }

        else -> throw IllegalArgumentException("Unknown Expression")
    }

fun main() {
//    println(evaluate(Summarized(Summarized(Number(1), Number(4)), Number(5))))
    println(evaluateWithLogging(Summarized((Summarized(Number(5), Number(10))), Number(10))))
}