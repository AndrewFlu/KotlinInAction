package ch_07_nullable.gengeric_nullable

// T может принимать значение null (фактический тип = Any?)
fun <T> printHashCode(element: T) {
    println(element?.hashCode()) // необходимо использовать '?', поскольку t МОЖЕТ быть null
}


// T НЕ может принимать значение null (фактический тип = Any)
fun <T: Any> printHashCodeNotNull(element: T) {
    println(element.hashCode())
}

fun main() {
    printHashCode(1)
    printHashCode(null) // T определяется как Any?

    println()

    printHashCodeNotNull(1)
//    printHashCodeNotNull(null) // T определяется как Any и не допускает null

}