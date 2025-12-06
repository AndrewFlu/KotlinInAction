package ch04_classes_interfaces.anonimous_classes

fun main() {
    var clickCount = 0
    val listener = object : MouseListener {
        override fun onEnter() {
            TODO("Not yet implemented")
        }

        override fun onClick() {
            clickCount++
        }
    }

    val button = Button(listener)
}