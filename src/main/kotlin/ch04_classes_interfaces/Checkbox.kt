package ch04_classes_interfaces

class Checkbox : Clickable, Focusable {
    override fun click() {
        println("Checkbox has been clicked!")
    }

    override fun printProperty() {
        super<Clickable>.printProperty()
        super<Focusable>.printProperty()
    }
}