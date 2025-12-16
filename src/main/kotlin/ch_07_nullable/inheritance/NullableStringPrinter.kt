package ch_07_nullable.inheritance

class NullableStringPrinter : StringProcessor {

    // тип String? — поддерживает null-значения
    override fun process(value: String?) {
        if (value != null)
            println(value)
    }
}