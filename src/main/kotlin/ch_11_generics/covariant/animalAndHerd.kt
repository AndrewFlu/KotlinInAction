package ch_11_generics.covariant

// Животное
open class Animal {
    fun feed() {
        println("Animal feed()")
    }
}


// Стадо. Типизируется конкретным типом, наследником Animal
class Herd<T : Animal> {
    val size: Int
        get() {
            TODO()
        }
    operator fun get(index: Int): T {
        println("Operator fun Herd.get()")
        return TODO("Provide the return value")
    }
}

// Накормить всё стадо животных
fun feedAll(animals: Herd<Animal>) {
    for (i in 0..<animals.size) {
        animals[i].feed()
    }
}

// Кошка относится к классу животных
class Cat: Animal() {
    fun cleanLitter() {
        // TODO("Provide clean litter code")
    }
}

fun takeCareOfCats(cats: Herd<Cat>) {
    for (i in 0..< cats.size)
        cats[i].cleanLitter()
    feedAll(cats) // required: Herd<Animal>, Found: Herd<Cat>
}