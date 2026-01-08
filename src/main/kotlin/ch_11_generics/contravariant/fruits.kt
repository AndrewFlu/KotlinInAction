package ch_11_generics.contravariant


// Базовый класс с общим свойством 'вес'
sealed class Fruit {
    abstract val weight: Int
}

data class Apple(override val weight: Int, val color: String) : Fruit()

data class Orange(override val weight: Int, val juicy: Boolean) : Fruit()

fun main() {
    val weightComparator = Comparator<Fruit> { fruit1, fruit2 -> fruit1.weight - fruit2.weight }

    val fruits: List<Fruit> = listOf(
        Orange(180, true),
        Apple(100, "green"),
    )
    val apples: List<Apple> = listOf(
        Apple(190, "red"),
        Apple(50, "orange"),
    )

    // можно использовать компаратор для любой коллекции объектов, представляющих подтип Fruit,
    // например яблок и апельсинов
    println(fruits.sortedWith(weightComparator))
    println(apples.sortedWith(weightComparator))
}