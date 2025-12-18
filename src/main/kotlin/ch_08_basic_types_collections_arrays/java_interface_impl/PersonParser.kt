package ch_08_basic_types_collections_arrays.java_interface_impl

import ch_08_basic_types_collections_arrays.primitives.Person

class PersonParser : DataParser<Person> {
    override fun parseData(
        input: String,
        output: MutableList<Person>, // изменяемый список с возможностью добавлять значения
        errors: MutableList<String?> // изменяемый список, в котором допускаются null-значения
    ) {
        TODO("Not yet implemented")
    }
}