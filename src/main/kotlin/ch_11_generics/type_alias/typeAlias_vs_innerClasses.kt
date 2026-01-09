package ch_11_generics.type_alias

// Валидатор на основе алиаса типа
typealias ValidatedInput = String

fun save_byTypeAlias(input: ValidatedInput): Unit = TODO("Валидация значения")


// Валидатор на основе внутреннего класса

@JvmInline
value class ValidatedInputClass(val input: String)

fun save_byInnerClass(input: ValidatedInputClass): Unit {
    TODO("Валидация значения с типом ValidatedInputClass")
}

fun main() {
    val userInput = "Unacceptable UserName @!"
    save_byTypeAlias(userInput)
    println()
//    save_byInnerClass(userInput) // не компилируется, т.к. типы не совпадают
    save_byInnerClass(ValidatedInputClass(userInput)) // а так компилируется, т.к. ожидается ValidatedInputClass
}