package ch_11_generics.asterisc

fun printFirst_1(list: List<*>) {
    if (list.isNotEmpty())
        println(list.first()) // first() возвращает тип Any? (nullable-Any)
}

fun <T> printFirst_2(list: List<T>) {
    if (list.isNotEmpty())
        println(list.first()) // first() возвращает тип T
}


fun main() {
    val motorCompanyList = listOf("Yamaha", "Suzuki", "Honda", "Harley-Davidson")
    printFirst_1(motorCompanyList)
    printFirst_2(motorCompanyList)

}
