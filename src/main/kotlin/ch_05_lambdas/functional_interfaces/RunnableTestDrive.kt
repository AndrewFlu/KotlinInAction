package ch_05_lambdas.functional_interfaces

fun main() {
    println("Before postponeComputation()")
    Computations().postponeComputation(100) { println("This is lambda parameter") }
    println("After postponeComputation()")
}
