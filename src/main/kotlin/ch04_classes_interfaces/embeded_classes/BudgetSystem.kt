package ch04_classes_interfaces.embeded_classes

import kotlin.math.exp

fun addExpecnce(axpence: RusRubAmount) {
    // сохранение расходов в российских рублях
}
val nds: Double = 20.0

@JvmInline
value class RusRubAmount(val amount: Double) : PrettyPrintable { // это встроенный класс: одно свойство и оно инициализируется в первичном конструкторе

    // fixme: нужна точность до 2-х знаков после запятой
    val vat get() = Math.round(amount - (amount / (1 + nds/100)))

    override fun prettyPrint() {
        println("${amount}руб.")
    }
}

fun main() {
    addExpecnce(RusRubAmount(10.0)) // американо 300 в Шкафу

    val expense = RusRubAmount(170.0)
    println("В том числе НДС: ${expense.vat} руб.")
    expense.prettyPrint()
}