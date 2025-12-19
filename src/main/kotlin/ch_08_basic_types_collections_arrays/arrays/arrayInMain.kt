package ch_08_basic_types_collections_arrays.arrays

// 1. В императивном стиле
//fun main(args: Array<String>) {
//    for (element in args.indices)
//        println("Argument $element is: ${args[element]}")
//}

// 2. В функциональном стиле
fun main(args: Array<String>) {
    args.forEachIndexed { index, element -> println("Argument $index is $element") }
}