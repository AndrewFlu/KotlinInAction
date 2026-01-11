package ch_12_annotations_and_reflection.reflection_api

class Man(val name: String, val age: Int)

fun main() {
    val zhenya = Man("Zhenya", 38)
    val ageProperty = Man::age // KProperty1<Man, Int>
    val nameProperty = Man::name // KProperty1<Man, String>

    val reflectionAge = ageProperty.get(zhenya)
    val reflectionName = nameProperty.get(zhenya)
    println("Reflection data: name = $reflectionName, age = $reflectionAge")
}
