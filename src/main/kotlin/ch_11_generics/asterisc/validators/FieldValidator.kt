package ch_11_generics.asterisc.validators

// тип T объявлен контравариантным (in T)
// Метод только потребляет значение T
interface FieldValidator <in T> {
    fun validate(input: T): Boolean
}