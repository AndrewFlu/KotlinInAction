package ch_11_generics.asterisc.validators

import kotlin.reflect.KClass

fun main() {
    val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()
    validators[String::class] = StringValidator
    validators[Int::class] = IntValidator

//    validators[String::class]!!.validate("test string") // не компилируется, т.к. не удаётся вывести нужный тип

    // приведение к нужному типу
    val stringFieldValidator = validators[String::class] as FieldValidator<String>
    println(stringFieldValidator.validate(""))
    println(stringFieldValidator.validate("check"))

    // "случайная" ошибка при выведении типа валидатора
    val invalidStringValidator = validators[Int::class] as FieldValidator<String>
    invalidStringValidator.validate("check string") // ClassCastException
}