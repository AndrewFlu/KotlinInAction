package ch04_classes_interfaces

fun main() {
    val button = Button()
    button.click()
    button.printProperty()

    val checkbox = Checkbox()
    checkbox.click()
    checkbox.setFocus(true)
    checkbox.setFocus(false)
    checkbox.setFocus(true)
    checkbox.printProperty()
}