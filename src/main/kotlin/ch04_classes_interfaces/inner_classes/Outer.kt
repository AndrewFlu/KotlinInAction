package ch04_classes_interfaces.inner_classes

class Outer {

    inner class Inner { // внутренний класс (помечен модификатором inner)
        fun getOuterReference() = this@Outer
    }
}