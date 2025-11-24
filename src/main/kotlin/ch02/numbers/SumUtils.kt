package ch02.numbers

fun evaluate(e: Expression): Int =
    when (e) {
        is Number -> e.value
        is Summarized -> evaluate(e.left) + evaluate(e.right)
        else -> throw IllegalArgumentException("Unknown Expression")
    }

fun main() {
    println(evaluate(Summarized(Summarized(Number(1), Number(4)), Number(5))))
}