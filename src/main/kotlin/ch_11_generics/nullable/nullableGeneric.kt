package ch_11_generics.nullable

class Processor<T> { // T без ограничений ДОПУСКАЕТ значение null
    fun process(value: T): Int? {
        return value?.hashCode() // value допускает значение null
    }
}

class Consumer<T : Any> { // T с ограничением верхней границы НЕ допускает значение null
    fun accept(element: T) {
        println("Accepted: $element" )
    }
}

fun main() {
    val nullableStringProcessor = Processor<String?>()
    println(nullableStringProcessor.process(null))
    println(nullableStringProcessor.process("a"))
    println()
    val consumer = Consumer<String>()
    consumer.accept("1")
}