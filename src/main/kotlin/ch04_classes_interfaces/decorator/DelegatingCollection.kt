package ch04_classes_interfaces.decorator

class DelegatingCollection<E>(
    innerList: Collection<E> = mutableListOf<E>()
) : Collection<E> by innerList