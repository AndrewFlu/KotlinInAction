package ch_10_higher_order_functions.declaration

// явное объявление типа переменных
val implicitTypeSum: (Int, Int) -> Int = { x, y -> x + y }
val implicitAction: () -> Unit = { println("Явное объявление типа функции") }


// неявное объявление типа переменных
val sum = { x: Int, y: Int -> x + y }
val action = { println("Неявное объявление типа функции") }

var canReturnNull: (Int, Int) -> Int? = { x, y -> null } // возвращающий тип функции может быть null
var funOrNull: ((Int, Int) -> Int)? = null // сама функция может быть null

fun main() {
    println(implicitTypeSum(1, 501))
    implicitAction()
    println()
    println(sum(5, 2))
    action()
    println()
    println("canReturnNull() = ${canReturnNull(5, 1)}")
    println("funOrNull() = ${funOrNull?.invoke(5, 5)}")
}