package ch04_classes_interfaces.decorator

import ch03_functions.strings.joinToString

class CountingSet<T>(
    private val innerSet: MutableCollection<T> = hashSetOf<T>()
) : MutableCollection<T> by innerSet // выполняется делегирование реализации MutableCollection внутренней переменной innerSet
{
    var objectsAdded = 0

    override fun add(element: T): Boolean {
        objectsAdded++

        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size

        return innerSet.addAll(elements)
    }
}

fun main() {
    val cset = CountingSet<Int>()
    cset.addAll(listOf(1, 1, 2))

    println("Added ${cset.objectsAdded} objects, ${cset.size} uniques.")
    println(cset.joinToString())
}