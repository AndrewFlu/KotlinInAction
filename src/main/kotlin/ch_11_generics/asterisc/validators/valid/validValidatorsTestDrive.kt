package ch_11_generics.asterisc.validators.valid

import ch_11_generics.asterisc.validators.FieldValidator
import ch_11_generics.asterisc.validators.IntValidator
import ch_11_generics.asterisc.validators.StringValidator
import kotlin.reflect.KClass

object Validators {

    // используется та же карта, но уже доступ из вне к ней нельзя получить
    private val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()

    fun <T : Any> registerValidator(kClass: KClass<T>, validator: FieldValidator<T>) {
        validators[kClass] = validator
    }

    operator fun <T: Any> get(kClass: KClass<T >): FieldValidator<T> =
        validators[kClass] as? FieldValidator<T>
            ?: throw IllegalArgumentException("No validator for ${kClass.simpleName}")
}

fun main() {
    Validators.registerValidator(String::class, StringValidator)
    Validators.registerValidator(Int::class, IntValidator)

    println(Validators[String::class].validate("Check"))
    println(Validators[Int::class].validate(7))
}