package ch_08_basic_types_collections_arrays.arrays

fun main(args: Array<String>) {
  for (element in args.indices)
      println("Argument $element is: ${args[element]}")
}