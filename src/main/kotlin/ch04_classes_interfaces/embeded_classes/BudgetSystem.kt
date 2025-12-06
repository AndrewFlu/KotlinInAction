package ch04_classes_interfaces.embeded_classes

fun addExpecnce(axpence: RusRubAmount) {
    // сохранение расходов в российских рублях
}

class RusRubAmount(val amount: Int)

fun main() {
    addExpecnce(RusRubAmount(170)) // американо 300 в Шкафу
}