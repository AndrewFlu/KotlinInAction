package ch04_classes_interfaces.modificators.open_final_abstract

import ch04_classes_interfaces.Clickable

// open — позволяет наследование этого класса
open class RichButton: Clickable {
    // эту функцию нельзя переопределить, т.к. она по умолчанию final
    fun disable() {}

    // открытая функция, её можно переопределить
    open fun animate() {}

    // эта функция помечена override, соответственно является открытой
    // Однако модификатор final заперщает её переопределение
    final override fun click() {
        println("Rich Button clicked")
    }

}