package ch04_classes_interfaces.sealed.interfaces

sealed interface Toggleable { // запечатанный интерфейс
    fun toggle()
}

class LightSwitch : Toggleable {
    override fun toggle() {
        println("Lights!")
    }
}

class Camera : Toggleable {
    override fun toggle() {
        println("Camera")
    }

}