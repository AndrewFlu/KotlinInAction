package ch_11_generics.nullable

class Processor<T> {
    fun process(value: T): Int? {
        return value?.hashCode() // value допускает значение null
    }
}

fun main() {
    val nullableStringProcessor = Processor<String?>()
    println(nullableStringProcessor.process(null))
    println(nullableStringProcessor.process("a"))
}