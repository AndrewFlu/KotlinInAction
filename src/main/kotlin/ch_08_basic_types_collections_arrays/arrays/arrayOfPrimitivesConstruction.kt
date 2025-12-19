package ch_08_basic_types_collections_arrays.arrays

fun main() {
    // 1 способ: соответствующий конструктор <PrimitiveType>Array(size: Int)
    val fiveZeros = IntArray(5)
    println(fiveZeros.joinToString())
    // 2 способ: фабричная функция (<primitiveType>ArrayOf())
    val fiveZeros2 = intArrayOf(0, 0, 0, 0, 0)
    println(fiveZeros2.joinToString())
    // 3 способ: конструктор с лямбдой <primitiveType>Array(size: Int){init: Int -> Int}
    val lambdaArray = IntArray(5) { init -> (init + 1) * (init + 1)}
    println(lambdaArray.joinToString())
}