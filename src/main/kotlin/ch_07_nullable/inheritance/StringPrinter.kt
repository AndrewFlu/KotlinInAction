package ch_07_nullable.inheritance

class StringPrinter : StringProcessor {

    // тип String, не поддерживает null-значения
    override fun process(value: String) {
        println(value)
    }
}