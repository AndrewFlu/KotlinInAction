package ch02.numbers

fun evaluate(e: Expression) : Int {
    if (e is Number) {
        val n = e as Number
        return n.value
    }
    if (e is Summarized) {
        return evaluate(e.right) + evaluate(e.left) // "умное" преобразование
    }
    throw IllegalArgumentException("Unknown Expression")
}

fun main() {
    println(evaluate(Summarized(Summarized(Number(1), Number(4)), Number(5))))
}