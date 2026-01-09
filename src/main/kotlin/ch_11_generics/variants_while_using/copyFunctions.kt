package ch_11_generics.variants_while_using

import ch_11_generics.covariant.Animal
import ch_11_generics.covariant.Cat

// функции копирования данных

// с ИНАВАРИАНТНЫМИ типами параметров (обобщённые типы без ограничений)
fun <T> copyDate_1(source: MutableList<T>, target: MutableList<T>) {
    for (element in source)
        target.add(element)
}

// добавляем ограничение: тип Source должен быть подтипом Target
fun <T : R, R> copyData_2(source: MutableList<T>, target: MutableList<R>) {
    for (element in source)
        target.add(element)
}

// добавляем КОВАРИАНТНЫЙ тип для Source
fun <T> copyData_3(source: MutableList<out T>, target: MutableList<T>) { // out T == ? extends T
    for (element in source)
        target.add(element)
}

// добавляем КОНТРАВАРИАНТНЫЙ тип для Target
fun <T> copyData_4(source: MutableList<T>, target: MutableList<in T>) { // in T == ? super T
    for (element in source)
        target.add(element)
}

fun main() {
    val animalList: MutableList<Animal> = mutableListOf(Animal(), Animal())
    val catList: MutableList<Cat> = mutableListOf(Cat(), Cat())

    println(copyDate_1(catList, mutableListOf(Cat())))

    println(copyData_2(catList, animalList))

    println(copyData_3(catList, animalList))

    println(copyData_4(catList, animalList))
}