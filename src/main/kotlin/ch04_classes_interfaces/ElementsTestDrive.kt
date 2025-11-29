package ch04_classes_interfaces

fun main() {
    val button = Button()
    button.click()
    button.printProperty()

    println()
    val checkbox = Checkbox()
    checkbox.click()
    checkbox.setFocus(true)
    checkbox.setFocus(false)
    checkbox.setFocus(true)
    checkbox.printProperty()

    println()
    val javaButton = JButton()
    javaButton.click()
    javaButton.printProperty()

}