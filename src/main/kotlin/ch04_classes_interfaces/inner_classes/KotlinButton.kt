package ch04_classes_interfaces.inner_classes

class KotlinButton : View {
    override fun getCurrentState(): State = KotlinButtonState()


    override fun restoreState(state: State) {

    }

    class KotlinButtonState : State {} // аналог вложенного класса в Java (static class)
}