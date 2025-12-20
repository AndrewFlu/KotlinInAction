package ch_09_operators.unary

import java.math.BigDecimal

operator fun BigDecimal.inc() = this + BigDecimal.ONE

fun main() {
    var number = BigDecimal.ZERO
    println(number++) // инкремент выполняется после первого выполнения инструкции println
    println(number)

    println(++number) // инкремент выполняется перед выполнением инструкции println
}