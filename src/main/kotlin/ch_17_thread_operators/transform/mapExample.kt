package ch_17_thread_operators.transform

import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

fun main() {
    val names = flow {
        emit("Juran")
        emit("Jenya")
        emit("Alex")
    }
    val uppercasedNames = names.map { it.uppercase() }

    runBlocking {
        uppercasedNames.collect { println(it) }
    }

}