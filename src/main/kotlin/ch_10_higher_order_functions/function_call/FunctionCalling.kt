package ch_10_higher_order_functions.function_call

fun mathOperation(operation: (Int, Int) -> Int, x: Int, y: Int) { //объявление параметра типа функции
    val result = operation(x, y) // вызов параметра типа функции
    println("Result: $result")
}

fun main() {
    val plusFun: (Int, Int) -> Int = { x, y -> x + y }
    mathOperation(plusFun, 5, 5)

    val multyplyFun: (Int, Int) -> Int = { x, y -> x * y }
    mathOperation(multyplyFun, 5, 5)
}

