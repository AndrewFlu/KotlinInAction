package ch03_functions.inheritance

fun main() {
    val element: Element = Element()
    val button: Element = Button()
    val buttonByButton: Button = Button()

    element.click()
    button.click()
    buttonByButton.click()

    println()

    element.clear()
    button.clear()
    buttonByButton.clear()

    println()

    element.printBaseInfo()
    button.printBaseInfo()
    buttonByButton.printBaseInfo()
}