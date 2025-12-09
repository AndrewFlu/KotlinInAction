package ch_05_lambdas.functional_interfaces

fun interface IntCondition {
    // только один абстрактный метод
    fun check(i: Int): Boolean

    // и дополнительно неабстрактные методы
    fun checkString(s: String) = check(s.toInt())
    fun checkChar(c: Char) = check(c.digitToInt())
}

fun main() {
    val isOdd = IntCondition { it % 2 != 0 } // число является нечётным?
    println(isOdd.check(1))
    println(isOdd.check(4))
    println(isOdd.check(5))
    println(isOdd.checkString("6"))
    println(isOdd.checkChar('3'))
}