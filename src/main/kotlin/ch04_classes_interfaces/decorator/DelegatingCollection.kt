package ch04_classes_interfaces.decorator

class DelegatingCollection<E> : Collection<E> {

    private val innerList = arrayListOf<E>()

    override val size: Int
        get() = innerList.size

    override fun isEmpty(): Boolean =
        innerList.isEmpty()

    override fun iterator(): Iterator<E> =
        innerList.iterator()


    override fun containsAll(elements: Collection<E>): Boolean =
        innerList.containsAll(elements)


    override fun contains(element: E): Boolean =
        innerList.contains(element)

}