package ch04_classes_interfaces

class Button: Clickable {
    override fun click() {
        println("Button has been clicked!")
    }
}