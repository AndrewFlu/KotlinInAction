package ch_08_basic_types_collections_arrays.unit

interface Processor<T> {
    fun process(): T
}

class NoResultProcessor : Processor<Unit> {
    override fun process() {
        // код процессора
        // писать return в явном виде нет необходимости
    }

}