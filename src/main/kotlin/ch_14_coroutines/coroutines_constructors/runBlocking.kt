package ch_14_coroutines.coroutines_constructors

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

suspend fun doSomethingSlowly() {
    delay(500.milliseconds)
    println("DoSomethingSlowly Done!")
}


fun main() {
    runBlocking{
        doSomethingSlowly()
    }
}