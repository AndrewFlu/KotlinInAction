package ch_08_basic_types_collections_arrays.mutable_immutable

fun <T> copyElements(source: Collection<T>, target: MutableCollection<T>) {
    for (element in source)
        target.add(element)
}

fun main() {
    val source: Collection<Int> = arrayListOf(1, 2, 3, 4, 5, 6)
    val target: MutableCollection<Int> = arrayListOf(7)
    copyElements(source, target) // модификация target
    println(target)

    val invalidTypeTarget: Collection<Int> = arrayListOf(0)
//    copyElements(source, invalidTypeTarget) // передавать отличный от целевого типа MutableCollection нельзя
}