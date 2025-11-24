package ch02.numbers

fun evaluate(e: Expression): Int =
    if (e is Number) {
        e.value
    } else if (e is Summarized) {
        evaluate(e.right) + evaluate(e.left) // "умное" преобразование
    } else {
        throw IllegalArgumentException("Unknown Expression")
    }

fun main() {
    println(evaluate(Summarized(Summarized(Number(1), Number(4)), Number(5))))
}