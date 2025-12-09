package ch_05_lambdas.functional_interfaces

fun main() {
    println("Before postponeComputation()")
    Computations().postponeComputation(100) { println("This is lambda parameter") }
    println("After postponeComputation()")
    Computations().postponeComputation(50, object : Runnable {
        override fun run() {
            println("Overriden runnable into object expression")
        }
    })
}
