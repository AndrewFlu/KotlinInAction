package ch_15_structured_concyrrency.closingResourcies

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

class DataBaseConnection : AutoCloseable {
    fun write(s: String) = println("Writing to BD: $s")

    override fun close() {
        println("DB connection closing!")
    }
}

fun main() {
    runBlocking {
        val dbTask = launch {
            val connection = DataBaseConnection()
            try {
                delay(500.milliseconds)
                connection.write("MacBook is awesome! Mac OS is suck!")
            } finally {
                connection.close()
            }
        }
        delay(250.milliseconds)
        dbTask.cancel()
    }

    println("Oops! There is a leak resource")
}