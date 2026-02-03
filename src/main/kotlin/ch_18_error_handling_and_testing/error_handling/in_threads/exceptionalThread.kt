package ch_18_error_handling_and_testing.error_handling.in_threads

import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

class MacBookException: Exception()

val exceptionalFlow = flow {
    repeat(5) {
        model -> emit(model)
    }
    throw MacBookException()
}

fun main() {
    runBlocking {
        val transformedFlow = exceptionalFlow.map {
            it * 2
        }

        try {
            transformedFlow.collect {
                println("$it ")
            }
        } catch (me: MacBookException) {
            println("[HANDLED] ${me.message ?: "Unsupported model"}")
        }
    }
}