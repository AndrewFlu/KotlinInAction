package ch_05_lambdas.method_references

fun salute() = println("Salute!")

fun main() {
    run(::salute)
}