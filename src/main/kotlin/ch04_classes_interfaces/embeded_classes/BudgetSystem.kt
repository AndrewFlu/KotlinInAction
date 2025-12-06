package ch04_classes_interfaces.embeded_classes

fun addExpecnce(axpence: RusRubAmount) {
    // сохранение расходов в российских рублях
}

@JvmInline
value class RusRubAmount(val amount: Int) // это встроенный класс: одно свойство и оно инициализируется в первичном конструкторе

fun main() {
    addExpecnce(RusRubAmount(170)) // американо 300 в Шкафу
}