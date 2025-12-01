package ch04_classes_interfaces.constructors

class Secret private constructor(private val agentName: String) {
}

fun main() {
//    println(Secret()) // нельзя создать объект Secret, т.к. у него закрытый конструктор
}