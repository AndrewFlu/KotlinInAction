package ch_11_generics.asterisc.validators

// object — это класс с синглтон-объектом
object StringValidator : FieldValidator<String> {
    override fun validate(input: String): Boolean = input.isNotEmpty()
}

object IntValidator : FieldValidator<Int> {
    override fun validate(input: Int): Boolean = input >= 0

}