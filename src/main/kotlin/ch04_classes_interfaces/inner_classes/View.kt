package ch04_classes_interfaces.inner_classes

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {
        TODO("Код для восстановления состояния из back-up'а")
    }
}