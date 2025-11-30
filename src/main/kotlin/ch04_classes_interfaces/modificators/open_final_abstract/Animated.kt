package ch04_classes_interfaces.modificators.open_final_abstract

abstract class Animated {

    abstract val animationSpeed: Double // абстрактное свойство. Нет значения. Требует определения

    val keyFrames: Int = 20 // закрытое свойство (по умолчанию final)
    open val frames: Int = 60 // открытое свойство. Можно переопределить

    abstract fun animate() // абстрактная функция. Нет реализации. Требует определения
    open fun stopAnimating() {} // неабстрактная функция. Явно помечена open и может быть переопределена
    fun animateTwice() {} // неабстрактная функция. Закрыта для переопределения (по умолчанию является final)

}