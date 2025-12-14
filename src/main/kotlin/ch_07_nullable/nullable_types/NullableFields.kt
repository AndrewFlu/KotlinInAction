package ch_07_nullable.nullable_types

class Employee(val name: String, val manager: Employee?)

fun getManager(employee: Employee): String? = employee.manager?.name

fun main() {
    val yuriyIvanovich = Employee("Yuriy Ivanovich", null)
    val zhenya = Employee("Zhenya", yuriyIvanovich)
    println("${yuriyIvanovich.name} has a manager: ${getManager(yuriyIvanovich)}")
    println("${zhenya.name} has a manager: ${getManager(zhenya)}")
}