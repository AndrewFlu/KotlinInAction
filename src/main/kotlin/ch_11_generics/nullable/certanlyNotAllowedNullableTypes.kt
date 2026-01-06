package ch_11_generics.nullable

class KBox<T> : JBox<T> {
    override fun put(element: T & Any) { // помечаем обобщённый тип Т как ОПРЕДЕЛЁННО НЕ ДОПУСКАЮЩИЙ значение null
        println("Put: $element")
    }

    override fun putIfNotNull(element: T) { // Оставляем тип "как есть"
        println("PutIfNotNull: $element")
    }

}

fun main() {
    val kbox = KBox<Int?>() // фиксируем nullable-тип
    kbox.put(1)
    kbox.putIfNotNull(null)
}