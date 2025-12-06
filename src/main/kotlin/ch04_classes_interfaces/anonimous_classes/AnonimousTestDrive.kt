package ch04_classes_interfaces.anonimous_classes

fun main() {
    val listener = object : MouseListener {
        override fun onEnter() {
            TODO("Not yet implemented")
        }

        override fun onClick() {
            TODO("Not yet implemented")
        }
    }

    val button = Button(listener)
}