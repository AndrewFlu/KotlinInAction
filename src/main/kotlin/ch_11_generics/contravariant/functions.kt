package ch_11_generics.contravariant

import ch_11_generics.covariant.Animal
import ch_11_generics.covariant.Cat

interface Function1<in P, out R> { // функция контравариантна по типу аргумента и ковариантна по типу возвращаемого значения
    operator fun invoke(p: P): R
}

fun enumerateCat(function: (Cat) -> Number) {

}

fun Animal.getIndex(): Int {
    TODO()
}

fun main() {
    enumerateCat(Animal::getIndex) // Животное — супертип для Кошки (контравариантность), а Int — подтип Number (ковариантность)
}