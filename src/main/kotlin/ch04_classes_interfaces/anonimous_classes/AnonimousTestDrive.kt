package ch04_classes_interfaces.anonimous_classes

fun main() {
    Button(object : MouseListener {
        override fun onEnter() {
            TODO("Not yet implemented")
        }

        override fun onClick() {
            TODO("Not yet implemented")
        }
    })
}